package com.banulp.webflux.service;

import com.banulp.webflux.model.Changbi;
import com.banulp.webflux.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private DatabaseClient databaseClient;

//    R2dbcEntityTemplate 을 쓰면 CRUD 편하게 가능

    public Flux<Changbi> retrieveBooksOfStar(int star) {
        Flux<Changbi> booksByStar = bookRepository.findBooksByStar(star);
        return booksByStar;
    }

    public Flux<Changbi> retrieveTempBooks() {
        Flux<Changbi> tempBooks = bookRepository.findTempBooks();
        return tempBooks;
    }

    public Flux<Changbi> retrieveSpecialBooks() {
        Flux<Changbi> specialBooks = databaseClient.execute("select id, title, author, star from changbi where star%15 = 0")
                .as(Changbi.class)
                .fetch()
                .all();
        return specialBooks;
    }

}

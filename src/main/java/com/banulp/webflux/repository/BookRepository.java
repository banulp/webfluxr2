package com.banulp.webflux.repository;

import com.banulp.webflux.model.Changbi;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BookRepository  extends ReactiveCrudRepository<Changbi, Long> {

    @Query("select id, title, author, star from changbi c where c.star = :star")
    Flux<Changbi> findBooksByStar(Integer star);

    @Query("select id, title, author, star from changbi")
    Flux<Changbi> findTempBooks();
}
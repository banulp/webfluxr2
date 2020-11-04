package com.banulp.webflux.controller;

import com.banulp.webflux.model.Changbi;
import com.banulp.webflux.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "banulp.lv", produces = "application/json;charset=UTF-8")
public class BookController {

    @Autowired
    BookService bookService;

//    @GetMapping("/getBooks/{publisher}")
//    public Book getBooks(@PathVariable String publisher) {
    @GetMapping("/getBooks")
    public Flux<Changbi> getBooks() {
        Flux<Changbi> tempBooks = bookService.retrieveTempBooks();
        return tempBooks;
    }

    @GetMapping("/getSpecialBooks")
    public Flux<Changbi> getSpecialBooks() {
        Flux<Changbi> tempBooks = bookService.retrieveSpecialBooks();
        return tempBooks;
    }
}

package com.banulp.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table
public class Changbi {

    @Id
    private Long id;
    private String title;
    private String author;
    private int star;

}

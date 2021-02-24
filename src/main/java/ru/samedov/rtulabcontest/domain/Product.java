package ru.samedov.rtulabcontest.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @Column
    @GeneratedValue()
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Purchase purchase;
}

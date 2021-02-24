package ru.samedov.rtulabcontest.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Person {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany
    Set<Purchase> purchases;
}

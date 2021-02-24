package ru.samedov.rtulabcontest.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@ToString(exclude = "products")
public class Purchase {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    Set<Product> products;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Person person;
}

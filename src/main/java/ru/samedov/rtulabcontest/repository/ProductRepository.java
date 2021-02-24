package ru.samedov.rtulabcontest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.samedov.rtulabcontest.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package ru.samedov.rtulabcontest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.samedov.rtulabcontest.domain.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}

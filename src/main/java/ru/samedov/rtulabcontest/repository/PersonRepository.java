package ru.samedov.rtulabcontest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.samedov.rtulabcontest.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

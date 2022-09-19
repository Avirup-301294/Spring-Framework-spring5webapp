package com.avirup.spring.spring5webapp.repositories;

import com.avirup.spring.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
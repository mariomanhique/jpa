package com.mariomanhique.jpa.repositories;

import com.mariomanhique.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

package com.orsys.authorservice.dao;

import com.orsys.authorservice.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "authors")
public interface AuthorDAO extends JpaRepository<Author, Long> {
    List<Author> findByName(String name);
}

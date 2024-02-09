package com.mariomanhique.jpa.repositories;

import com.mariomanhique.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {


//        @Query(
//                value = "select * from Author a where a.firstName = :firstName",
//                nativeQuery = true
//        )
//        Author findAuthorBy(
//                @Param("firstName") String firstName
//        );
}

package com.mariomanhique.jpa;

import com.mariomanhique.jpa.models.Author;
import com.mariomanhique.jpa.models.Video;
import com.mariomanhique.jpa.repositories.AuthorRepository;
import com.mariomanhique.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping
@RestController("api/v1/authors")
@SpringBootApplication
public class JpaApplication {

    AuthorRepository authorRepository;


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
          AuthorRepository authorRepository,
          VideoRepository videoRepository
    ) {

        return args -> {

//            var author = Author.builder()
//                    .firstName("Mario")
//                    .lastName("Manhique")
//                    .email("mario@gmail.com")
//                    .age(25)
//                    .createdAt(LocalDateTime.now())
//                    .build();

            var video = Video.builder()
                    .name("abc")
                    .length(5)
                    .build();

            videoRepository.save(video);
        };

    }

//    @GetMapping("")
//    List<Author> getAuthors(){
//        var author = Author.builder()
//                .firstName("Mario")
//                .lastName("Manhique")
//                .email("mario@gmail.com")
//                .age(25)
//                .createdAt(LocalDateTime.now())
//                .build();
//        return Arrays.asList(author,author);
//    }

}

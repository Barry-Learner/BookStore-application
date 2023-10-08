package com.mybook.mybook;

import com.mybook.mybook.entities.Book;
import com.mybook.mybook.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MybookApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybookApplication.class, args);
    }
   /* @Bean
    CommandLineRunner commandLineRunner(BookRepo bookRepo){
        return args -> {
            Book b1 = new Book(null,"Alchimiste",86.9);
            bookRepo.save(b1);
            Book b = bookRepo.getBookById(1L);
            System.out.println("le titre est: "+ b.getTitre());
        };
    }*/

}

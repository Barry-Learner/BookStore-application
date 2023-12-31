package com.mybook.mybook.controllers;

import com.mybook.mybook.models.BookRequest;
import com.mybook.mybook.models.BookResponse;
import com.mybook.mybook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/{id}")
    public BookResponse getBook(@PathVariable("id") Long id){
        return bookService.getOneBook(id);
    }

    @PostMapping("/add")
    public BookResponse addBook(@RequestBody BookRequest bookRequest){
        return bookService.addBook(bookRequest);
    }

    @GetMapping("/books")
    public List<BookResponse> allBooks(){
        return bookService.getAllBooks();
    }
    @DeleteMapping("/deleteBoook/{id}")
    public void deleteBook(@PathVariable("id") Long id){bookService.deleteBook(id);}
    @PutMapping("/updateBook")
public BookResponse updateBook(@RequestBody BookRequest bookRequest){return bookService.updateBook(bookRequest);}


}

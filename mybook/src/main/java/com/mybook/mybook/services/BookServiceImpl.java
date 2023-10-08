package com.mybook.mybook.services;

import com.mybook.mybook.entities.Book;
import com.mybook.mybook.models.BookRequest;
import com.mybook.mybook.models.BookResponse;
import com.mybook.mybook.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;
    @Override
    public BookResponse addBook(BookRequest bookRequest) {
        Book newBook = new Book();
        newBook.setTitre(bookRequest.getTitre());
        newBook.setPrix((bookRequest.getPrix()));
        bookRepo.save(newBook);
        return new BookResponse(newBook);
    }

    @Override
    public BookResponse getOneBook(Long id) {
        Book book = bookRepo.getBookById(id);
        return new BookResponse(book);
    }

    @Override
    public List<BookResponse> getAllBooks() {
        List<BookResponse> repBooks = new ArrayList<>();
        List<Book> books = bookRepo.findAll();
        for (Book b:books) {
            repBooks.add(new BookResponse(b));
        }
        return repBooks;
    }

    @Override
    public void deleteBook(Long id){
        bookRepo.deleteById(id);
    }
     public BookResponse updateBook(BookRequest bookRequest){
       Book updateBook = new Book();
       updateBook.setPrix(updateBook.getPrix());
       updateBook.setTitre(updateBook.getTitre());
       bookRepo.save(updateBook);
       return  new BookResponse(updateBook);

     }
}

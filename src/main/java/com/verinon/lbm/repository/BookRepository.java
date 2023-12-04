package com.verinon.lbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.lbm.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer>
{
    //List<BookPojo> findByBook_name(String book_name);
}

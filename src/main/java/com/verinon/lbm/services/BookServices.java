package com.verinon.lbm.services;

import org.springframework.stereotype.Service;

import com.verinon.lbm.entity.Book;

import java.util.ArrayList;
import java.util.Date;

import java.util.Iterator;
import java.util.List;

@Service
public class BookServices
{

    static List<Book> listOfBooks= new ArrayList<>();
    static int id=4;
    static
    {
        //id=4;
        listOfBooks.add(new Book(1,"C","DenniesRich",150.25,"ComputerScience",new Date(),new Date(),new Date(),true));
        listOfBooks.add(new Book(2,"Java","James",180.25,"ComputerScience",new Date(),new Date(),new Date(),true));
        listOfBooks.add(new Book(3,"Python","Rossum",250.95,"ComputerScience",new Date(),new Date(),new Date(),true));
    }


    public List<Book> showAllBooksData()
    {

        return listOfBooks;
    }

    public List<Book> addBook(String book_name,String book_authors,double book_price,Date book_published,boolean is_book_available,String book_dept)
    {
        listOfBooks.add(new Book(id++,book_name, book_authors,book_price, book_dept, new Date(), new Date(),book_published,is_book_available));

        return listOfBooks;
    }

    public void delBook(int id)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            Book bid=(Book) it.next();
            if(bid.getBook_id()==id)
            {
                it.remove();
            }
        }
    }

    public void editBook(int id, String bookname)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            Book bid=(Book) it.next();
            if(bid.getBook_id()==id)
            {
                bid.setBook_name(bookname);
            }
        }
    }

    public Book getBookDetails(String book_name)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            Book mybook=(Book) it.next();
            if((mybook.getBook_name()).equalsIgnoreCase(book_name))
            {
                return mybook;
            }
        }
        return null;
    }



}

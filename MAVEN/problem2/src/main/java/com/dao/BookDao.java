package com.dao;

import com.model.Book;

public interface BookDao {
    public Book GetAllInfoByID(int book_ID);
    public String CreateBook(Book book);
    public Boolean DeleteBook(int book_ID);
    public String UpdateTheBook(int book_ID);
}

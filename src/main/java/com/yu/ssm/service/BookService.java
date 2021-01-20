package com.yu.ssm.service;
import com.yu.ssm.pojo.book;


import java.util.ArrayList;

public interface BookService {
    void add(book book);
    void delete(String bookName);
    void update(book book);
    ArrayList<book> query();
    book queryBookName(String bookName);
}

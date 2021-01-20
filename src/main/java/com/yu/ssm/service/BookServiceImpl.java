package com.yu.ssm.service;

import com.yu.ssm.mapper.BookMapper;
import com.yu.ssm.pojo.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public void add(book book) {
        bookMapper.add(book);
    }

    public void delete(String bookName) {
        bookMapper.delete(bookName);
    }

    public void update(book book) {
            bookMapper.update(book);
    }

    public ArrayList<book> query() {
        return bookMapper.query();
    }

    public book queryBookName(String bookName) {
        return bookMapper.queryBookName(bookName);
    }
}

package com.yu.ssm.mapper;

import com.yu.ssm.pojo.book;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface BookMapper {
    void add(book book);
    void delete(@Param("bookName") String bookName);
    void update(book book);
    ArrayList<book> query();
    book queryBookName(@Param("bookName")String bookName);
}

package com.yu.ssm.mapper;


import com.yu.ssm.pojo.book;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class BookMapperImpl implements BookMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public void add(book book) {
        sqlSessionTemplate.getMapper(BookMapper.class).add(book);
    }

    public void delete(String bookName) {
        sqlSessionTemplate.getMapper(BookMapper.class).delete(bookName);
    }

    public void update(book book) {
        sqlSessionTemplate.getMapper(BookMapper.class).update(book);
    }

    public ArrayList<book> query() {
        return  sqlSessionTemplate.getMapper(BookMapper.class).query();
    }

    public book queryBookName(String bookName) {
        return  sqlSessionTemplate.getMapper(BookMapper.class).queryBookName(bookName);
    }
}

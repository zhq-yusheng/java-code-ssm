package com.yu.ssm.controller;

import com.yu.ssm.pojo.book;
import com.yu.ssm.service.BookServiceImpl;
import com.yu.ssm.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookServiceImpl;

    @GetMapping("/update")
    @ResponseBody
    public String update(book book){
        bookServiceImpl.update(book);
        return "修改完成";
    }
    @GetMapping("/query")
    @ResponseBody
    public String query(){
        ArrayList<book> query = bookServiceImpl.query();
        return JsonUtils.getJson(query);
    }
}

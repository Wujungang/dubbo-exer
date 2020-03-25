package com.atguigu.gmall.manage.controller;


import com.atguigu.gmall.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.atguigu.gmall.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("findAll")
    @ResponseBody
    public List<Book> findAll(){
        List<Book> bookList = bookService.getBookList();
        return bookList;

    }


}

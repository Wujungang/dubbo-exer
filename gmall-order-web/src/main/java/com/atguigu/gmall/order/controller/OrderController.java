package com.atguigu.gmall.order.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.Book;
import com.atguigu.gmall.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference
    private BookService bookService;

    @GetMapping("/trade")
    public Book trade(String id){
        int i = Integer.parseInt(id);
        Book bookByAuthorId = bookService.getBookByAuthorId(i);
        return bookByAuthorId;
    }
}

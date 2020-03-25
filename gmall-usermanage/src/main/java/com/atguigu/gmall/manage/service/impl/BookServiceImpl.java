package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.Book;
import com.atguigu.gmall.manage.mapper.AythorMapper;
import com.atguigu.gmall.manage.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.atguigu.gmall.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AythorMapper aythorMapper;


    @Override
    public List<Book> getBookList() {
        return bookMapper.selectAll();
    }

    @Override
    public Book getBookByAuthorId(Integer id) {
        Book book = new Book();
        book.setAuthorId(id);
        Book book1 = bookMapper.selectOne(book);
        return book1;
    }
}

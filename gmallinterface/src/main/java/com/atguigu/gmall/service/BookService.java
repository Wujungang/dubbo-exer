package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList();

    Book getBookByAuthorId(Integer id);
}

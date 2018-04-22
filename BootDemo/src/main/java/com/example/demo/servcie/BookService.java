package com.example.demo.servcie;

import java.util.List;

import com.example.demo.bean.Book;
import com.example.demo.bean.PageInfo;

public interface BookService {
	void update(Book book);
	void add(Book book);
	void delete(String[] ids);
	List<Book> selectBooksAll(PageInfo page);
	List<Book> selectBooksLike(Book book);
}

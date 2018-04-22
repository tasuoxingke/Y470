package com.example.demo.servcie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.BizException;
import com.example.demo.bean.Book;
import com.example.demo.bean.PageInfo;
import com.example.demo.dao.BookDao;
import com.example.demo.servcie.BookService;
import com.example.demo.util.BookUtil;

@Service("bookService")
public class BookServcieImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	@Override
	public void update(Book book) {
		if(BookUtil.checkBookVo(book)==false) {
			throw new BizException("请填写完整信息，书籍名称和出版社不能为空");
		}
		bookDao.update(book);
	}

	@Override
	public void add(Book book) {
		if(BookUtil.checkBookVo(book)==false) {
			throw new BizException("请填写完整信息，书籍名称和出版社不能为空");
		}
		bookDao.add(book);
	}

	@Override
	public void delete(String[] ids) {
		if(ids.length==0) {
			throw new BizException("请勾选信息");
		}
		bookDao.delete(ids);
	}

	@Override
	public List<Book> selectBooksAll(PageInfo page) {
		return bookDao.selectBooksAll(page);
	}

	@Override
	public List<Book> selectBooksLike(Book book) {
		return bookDao.selectBooksLike(book);
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

}

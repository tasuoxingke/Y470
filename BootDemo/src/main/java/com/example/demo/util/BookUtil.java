package com.example.demo.util;

import org.springframework.util.StringUtils;

import com.example.demo.bean.Book;

public class BookUtil {
	public static boolean checkBookVo(Book book) {
		if(null==book) {
			return false;
		}
		if(StringUtils.isEmpty(book.getBookName())) {
			return false;
		}
		if(StringUtils.isEmpty(book.getPublisher())) {
			return false;
		}
		if(book.getId()==null) {
			return false;
		}
		return true;
	}
	public static boolean checkBookVoLike(Book book) {
		if(null==book) {
			return false;
		}
		if(StringUtils.isEmpty(book.getBookName())) {
			return false;
		}
		if(StringUtils.isEmpty(book.getPublisher())) {
			return false;
		}
		return true;
	}
}

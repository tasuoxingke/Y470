package com.example.demo.util;

import org.springframework.util.StringUtils;

import com.example.demo.bean.Book;

public final class BookUtil {
	/**
	 * 判断book对象是否为空，判断书名，出版商是否为空，判断Id是否为空
	 * @param book
	 * @return
	 */
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
	/**
	 * 判断book对象是否为空，判断书名是否为空，判断出版商是否为空。
	 * @param book
	 * @return
	 */
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

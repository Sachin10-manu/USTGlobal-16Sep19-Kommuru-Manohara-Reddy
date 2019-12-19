package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Book book = context.getBean(Book.class);
		System.out.println("book name: "+book.getName());
		System.out.println("book author: "+book. getAuthor().getName());
		System.out.println("book price: "+book.getPrice());
		System.out.println("book name: "+book.getAuthor().getPenName());
	}
}

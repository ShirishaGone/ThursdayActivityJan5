package com.mapping;

import com.dao.BookDao;
import com.dao.LibraryDao;

import java.awt.print.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MappingMain {
	public static void main(String[] args) {
		
		ApplicationContext app =new ClassPathXmlApplicationContext("Bean.xml");
		BookDao bdao=(BookDao) app.getBean("BookDao");
       
		
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		bdao.insertBook(b1);
		bdao.insertBook(b2);
		bdao.insertBook(b3);
		
		LibraryDao ldao=(LibraryDao) app.getBean("LibraryDao");
		
		LibraryDao l1=new LibraryDao(1,"public",b1);
		LibraryDao l2=new LibraryDao(2,"College",b2);	
		
		ldao.insertLibrary(l1);
		ldao.insertLibrary(l2);
		
}
}

package com.daoimpl;

import java.awt.print.Book;

import com.dao.LibraryDao;

public interface HibernateTemplate {

	void save(LibraryDao lib);

	void save(Book b);

}

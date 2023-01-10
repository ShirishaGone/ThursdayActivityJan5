package com.daoimpl;

import java.awt.print.Book;


import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.jpa.HibernateQuery;


class BookDaoImpl implements BookDao {
	  private HibernateTemplate ht;
	  
		@Transactional
		public int insertBook(Book b) {
			ht.save(b);
			return 1;
		}

		@Transactional
		public int updateBook(Book b) {
			ht.save(b);
			return 1;
		}

		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt() {
			
		} void setHt(HibernateTemplate ht) {
			this.ht = ht;
		 
		 }
		
}
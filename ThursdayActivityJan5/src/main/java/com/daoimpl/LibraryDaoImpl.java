package com.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;

import com.dao.LibraryDao;

import org.springframework.orm.hibernate5.HibernateTemplate;


public class LibraryDaoImpl implements LibraryDao {
	private HibernateTemplate ht1;
	@Transactional
	public int insertLibrary(LibraryDao lib) {
		ht1.save(lib);
		return 1;
	}
	public HibernateTemplate getHt1() {
		return ht1;
	}
	public void setHt1(HibernateTemplate ht1) {
		this.ht1 = ht1;
	}
}

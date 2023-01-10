package com.entity;

import java.awt.print.Book;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryEntity {
	@Id
	private int Library_Id;
	private String Library_Name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	Book boo ;
	
}

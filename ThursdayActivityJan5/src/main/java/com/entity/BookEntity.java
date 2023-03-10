package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
	@Id
	private int Book_Id;
	private String Book_Name;
	private String Book_Author;

}

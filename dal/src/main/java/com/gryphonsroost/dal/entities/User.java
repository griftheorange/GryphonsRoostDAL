package com.gryphonsroost.dal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String userEmail;
	private String password;
}

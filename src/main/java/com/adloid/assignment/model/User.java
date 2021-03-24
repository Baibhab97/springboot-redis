package com.adloid.assignment.model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String name;
	private int age;
	private String occupation;

	@Override
	public String toString() {
		return "User{" + "email='" + email + '\'' + ", name='" + name + '\'' + ", age=" + age + ", occupation="
				+ occupation + '}';
	}
}

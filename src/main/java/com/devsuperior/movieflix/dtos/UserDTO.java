package com.devsuperior.movieflix.dtos;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.User;

public class UserDTO {

	private Long id;
	@NotBlank(message = "Favor insirir um nome!")
	private String name;
	@Email(message = "Favor entrar com um email válido!")
	private String email;
	
	public UserDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UserDTO(User entity) {
	   id = entity.getId();
       name = entity.getName();
       email = entity.getEmail();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(id, other.id);
	}
	
}

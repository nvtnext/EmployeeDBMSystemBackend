package org.jsp.userbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootapp.dto.User;
import org.jsp.userbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	public User updateUser(User user) {
		return repository.save(user);
	}
	public Optional<User> findUser(int id){
		return repository.findById(id);
	}
	public List<User> findAll(){
		return repository.findAll();
	}
	public void deleteUser(int id) {
		repository.deleteById(id);
	}
	public Optional<User> verifyUser(long phone, String password){
		return repository.verifyUser(phone, password);
	}
	public Optional<User> verifyUser(String email, String password){
		return repository.verifyUser(email, password);
	}

}

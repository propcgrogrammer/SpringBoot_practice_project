package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findAll();

	User save(User user);

	User findByUserName(String userName);

	void delete(User user);

}

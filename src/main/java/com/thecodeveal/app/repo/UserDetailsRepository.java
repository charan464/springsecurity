package com.thecodeveal.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thecodeveal.app.model.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}

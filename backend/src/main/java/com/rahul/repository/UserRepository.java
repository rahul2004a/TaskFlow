package com.rahul.repository;

import com.rahul.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    public User findByEmail(String email);
}

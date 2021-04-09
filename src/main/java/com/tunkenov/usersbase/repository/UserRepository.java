package com.tunkenov.usersbase.repository;

import com.tunkenov.usersbase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

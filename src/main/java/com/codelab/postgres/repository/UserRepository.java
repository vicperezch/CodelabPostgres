package com.codelab.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codelab.postgres.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}



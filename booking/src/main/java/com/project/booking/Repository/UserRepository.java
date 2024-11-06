package com.project.booking.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.booking.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User>findUserByEmil(String email);
}

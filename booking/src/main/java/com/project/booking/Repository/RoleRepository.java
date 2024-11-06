package com.project.booking.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.booking.entity.Role;
@Repository
public interface RoleRepository  extends JpaRepository<Role, Integer>{
    Optional<Role>findByname(String name);
}

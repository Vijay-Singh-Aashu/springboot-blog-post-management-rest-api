package com.excellence_springboot_blog_post_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence_springboot_blog_post_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}

package com.excellence_springboot_blog_post_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence_springboot_blog_post_management.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

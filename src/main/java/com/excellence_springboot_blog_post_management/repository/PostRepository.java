package com.excellence_springboot_blog_post_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence_springboot_blog_post_management.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByCategoryId(Long categoryId);

}

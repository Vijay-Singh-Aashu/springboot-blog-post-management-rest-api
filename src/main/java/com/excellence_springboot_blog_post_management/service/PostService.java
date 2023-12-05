package com.excellence_springboot_blog_post_management.service;

import java.util.List;

import com.excellence_springboot_blog_post_management.payload.PostDto;
import com.excellence_springboot_blog_post_management.payload.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto);

	PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

	PostDto getPostById(long id);

	PostDto updatePost(PostDto postDto, long id);

	void deletePostById(long id);

	List<PostDto> getPostsByCategory(Long categoryId);
}

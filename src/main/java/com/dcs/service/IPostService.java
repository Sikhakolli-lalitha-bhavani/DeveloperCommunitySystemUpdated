package com.dcs.service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.dcs.dto.PostDTO;
@Service
public interface IPostService {

	PostDTO addPost(PostDTO post);

	//PostDTO updatePost(PostDTO post);


	PostDTO getPostById(Integer postId);

	PostDTO removePost(Integer postId);


	//List<PostDTO> findByTopic(String topic, int page, int pageSize);

	//Page<PostDTO> getAllPosts(int page, int size);

	List<PostDTO> viewPost();

	List<PostDTO> findByTopic(String topic);

	PostDTO updatePost(Integer id, PostDTO post);

}
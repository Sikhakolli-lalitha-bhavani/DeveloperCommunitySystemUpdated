package com.dcs.service;


import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dcs.dto.DeveloperDTO;
import com.dcs.dto.PostDTO;
import com.dcs.entity.Developer;
import com.dcs.exception.DeveloperCommunitySystemException;
import com.dcs.exception.NoEntityFoundException;
@Service
public interface IDeveloperService {

	DeveloperDTO addDeveloper(DeveloperDTO developer);


	DeveloperDTO getDeveloperById(Integer devId) throws NoEntityFoundException;

	List<DeveloperDTO> getDeveloperByReputation(Integer reputation);

	


	List<DeveloperDTO> getDevelopersByStatus(String status);


//	Page<PostDTO> getPostsByDeveloper(Integer page, int size, int devId);






	Page<DeveloperDTO> getAllDevelopers(int page, int size);


	List<DeveloperDTO> viewDevelopers();


	String delete(Integer id);


	DeveloperDTO updateDeveloper(Integer id, DeveloperDTO developer);







}
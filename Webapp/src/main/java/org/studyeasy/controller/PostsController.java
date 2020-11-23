package org.studyeasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.Post;
import org.studyeasy.services.PostsService;


@RestController
public class PostsController {

	
	
	
	@RequestMapping("/posts")
	public List<Post> getAllPosts(){
		return new PostsService().getAllPosts();
	}
	
	
}

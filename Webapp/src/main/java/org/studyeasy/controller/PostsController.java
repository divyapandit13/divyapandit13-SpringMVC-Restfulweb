package org.studyeasy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.Post;
import org.studyeasy.services.PostsService;


@RestController
public class PostsController {

	
	
	//get all posts
	@RequestMapping("/posts")
	public List<Post> getAllPosts(){
		return new PostsService().getAllPosts();
	}
	
	
	//get particular post
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id){
		return new PostsService().getPost(id);
	}
	
	
	
	
}

package org.studyeasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.Post;


@RestController
public class PostsController {

	List<Post> posts = new ArrayList<>();
	

	public PostsController() {
	posts.add(new Post(1,"hello", "world"));
	posts.add(new Post(2,"lamda Expressions", "core java"));
	posts.add(new Post(3,"OOP", "java"));
	posts.add(new Post(4,"Inheritance", "Polymorphism"));
	}
	
	
	@RequestMapping("/posts")
	public List<Post> getAllPosts(){
		return posts;
	}
	
	
}

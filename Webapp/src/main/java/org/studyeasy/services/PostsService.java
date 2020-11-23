package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;


@Service
public class PostsService {
List<Post> posts = new ArrayList<>();
	

	public PostsService() {
	posts.add(new Post(1,"hello", "world"));
	posts.add(new Post(2,"lamda Expressions", "core java"));
	posts.add(new Post(3,"OOP", "java"));
	posts.add(new Post(4,"Inheritance", "Polymorphism"));
	}
	
	public List<Post> getAllPosts(){
		return posts;
	}

	public Post getPost(int id) {
		for(Post post : posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
		
	}
}

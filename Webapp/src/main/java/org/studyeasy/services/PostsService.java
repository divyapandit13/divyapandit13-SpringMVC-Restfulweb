package org.studyeasy.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;


@Service
public class PostsService {
  static List<Post> posts = new ArrayList<>(
		
		Arrays.asList(
				new Post(1,"hello", "world"),
				new Post(2,"lamda Expressions", "core java"),
				new Post(3,"OOP", "java"),
				new Post(4,"Inheritance", "Polymorphism")
				)
		);
	

	
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

	public void addPost(Post listElement) {
		posts.add(listElement);
	}
}

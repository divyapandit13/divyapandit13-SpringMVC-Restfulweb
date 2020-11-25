package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	
@Id
@Column(name = "id")
 int postId;

@Id
@Column(name = "title")
 String title;

@Id
@Column(name = "id")
 String body;
 
//Constructor
 public Post(int postId, String title, String body) {
	
		postId = this.postId;
		title = this.title;
		body = this.body;
	}
 
 
 //getter and setter
public int getpostId() {
	return postId;
}

public void setpostId(int postId) {
	postId = this.postId;
}
public String gettitle() {
	return title;
}
public void settitle(String title) {
	title = this.title;
}
public String getbody() {
	return body;
}
public void setbody(String body) {
	body = this.body;
}


//to string method
@Override
public String toString() {
	return "Post [postId=" + postId + ", title=" + title + ", body=" + body + "]";
}




 
}

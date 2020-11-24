package org.studyeasy.entity;

public class Post {
 int PostId;
 String Title;
 String Body;
 
//Constructor
 public Post(int postId, String title, String body) {
	
		PostId = postId;
		Title = title;
		Body = body;
	}
 
 
 //getter and setter
public int getPostId() {
	return PostId;
}

public void setPostId(int postId) {
	PostId = postId;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getBody() {
	return Body;
}
public void setBody(String body) {
	Body = body;
}


//to string method
@Override
public String toString() {
	return "Post [PostId=" + PostId + ", Title=" + Title + ", Body=" + Body + "]";
}




 
}

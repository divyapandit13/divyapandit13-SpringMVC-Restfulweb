package org.studyeasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	

}

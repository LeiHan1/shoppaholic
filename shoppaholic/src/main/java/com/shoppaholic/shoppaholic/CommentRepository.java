package com.shoppaholic.shoppaholic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	List<Comment> findByCustomer(Customer customer);
	
	List<Comment> findByProduct(Product product);
	
	 
	
	
}
	  
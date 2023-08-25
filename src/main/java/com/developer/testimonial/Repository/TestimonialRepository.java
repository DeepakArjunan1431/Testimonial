package com.developer.testimonial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.testimonial.Entity.TestimonialEntity;

@Repository
public interface TestimonialRepository extends JpaRepository<TestimonialEntity, Integer>{
	
}

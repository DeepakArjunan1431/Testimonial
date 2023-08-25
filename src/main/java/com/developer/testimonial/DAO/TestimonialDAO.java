package com.developer.testimonial.DAO;

import java.util.List;
import java.util.Optional;

import com.developer.testimonial.Entity.TestimonialEntity;

public interface TestimonialDAO {

	public List<TestimonialEntity> getAllDetails();
	
	public Optional<TestimonialEntity> getAllDetailsById(int id);
	
	public TestimonialEntity saveAllDetails(TestimonialEntity testimonialEntity);
	
	public TestimonialEntity UpdateAllDetails(TestimonialEntity testimonialEntity);
	
	public void  DeleteAllDetails(int id);
	
	
	
}

package com.developer.testimonial.DAO;

import java.util.List;
import java.util.Optional;

import com.developer.testimonial.Entity.TestimonialEntity;

public interface TestDAO {
	
	public List<TestimonialEntity> getAllDetails();
	
	public Optional<TestimonialEntity> getDetailsById(int id);
	
	public TestimonialEntity saveAllDetails(TestimonialEntity testimonialEntity);
	
	public TestimonialEntity updateAllDetails(TestimonialEntity testimonialEntity);
	
	public void deleteDetailsById(int id);

}

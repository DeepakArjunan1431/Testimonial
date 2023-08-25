package com.developer.testimonial.Service;

import java.util.List;
import java.util.Optional;

import com.developer.testimonial.Model.TestimonialModel;

public interface TestService {
	
	public List<TestimonialModel> getAllDetails();
	
	public Optional<TestimonialModel> getAllDetailsById(int id);
	
	public TestimonialModel saveAllDetails (TestimonialModel testimonialModel);
	
	public TestimonialModel updateAllDetails (TestimonialModel testimonialModel);
	
	public void deleteDetailsById(int id);

}

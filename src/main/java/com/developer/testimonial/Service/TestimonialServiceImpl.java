package com.developer.testimonial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.testimonial.DAO.TestimonialDAO;
import com.developer.testimonial.Entity.TestimonialEntity;
import com.developer.testimonial.Repository.TestimonialRepository;

@Service
public class TestimonialServiceImpl implements TestimonialService{

	@Autowired
	public TestimonialDAO testimonialDAO;
	
	@Autowired 
	public TestimonialRepository testimonialRepository;
	
	public List<TestimonialEntity> getAllDetails() {
		return testimonialRepository.findAll();
	}

	
	public Optional<TestimonialEntity> getAllDetailsById(int id) {
		return testimonialRepository.findById(id);
	}

	
	public TestimonialEntity saveAllDetails(TestimonialEntity testimonialEntity) {
		return testimonialRepository.save(testimonialEntity);
	}

	
	public TestimonialEntity UpdateAllDetails(TestimonialEntity testimonialEntity) {
		return testimonialRepository.save(testimonialEntity);
	}

	
	public void DeleteAllDetails(int id) {
		testimonialRepository.deleteById(id);
	}
	
	

}

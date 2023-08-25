package com.developer.testimonial.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.developer.testimonial.Entity.TestimonialEntity;
import com.developer.testimonial.Repository.TestimonialRepository;

public class TestimonialDAOImpl implements TestimonialDAO{

	@Autowired
	TestimonialRepository testREpo;
	
	
	@Override
	public List<TestimonialEntity> getAllDetails() {
		return testREpo.findAll();
		}


	@Override
	public Optional<TestimonialEntity> getAllDetailsById(int id) {
		return testREpo.findById(id);
	}


	@Override
	public TestimonialEntity saveAllDetails(TestimonialEntity testimonialEntity) {
		return testREpo.save(testimonialEntity);
	}


	@Override
	public TestimonialEntity UpdateAllDetails(TestimonialEntity testimonialEntity) {
		return testREpo.save(testimonialEntity);
	}


	@Override
	public void DeleteAllDetails(int id) {
		testREpo.deleteById(id);
		
	}
	
	

}

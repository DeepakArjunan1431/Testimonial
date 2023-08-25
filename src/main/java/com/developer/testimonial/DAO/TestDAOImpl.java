package com.developer.testimonial.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.testimonial.Entity.TestimonialEntity;
import com.developer.testimonial.ModelMapper.TestimonialModelMapper;
import com.developer.testimonial.Repository.TestimonialRepository;



@Service
public class TestDAOImpl implements TestDAO{
	
	
	
	@Autowired
	TestimonialRepository testimonialRepository;
	
	@Autowired
	TestimonialModelMapper testimonialModelMapper;
	
	
	
	
	
	@Override
	public List<TestimonialEntity> getAllDetails() {
		return testimonialRepository.findAll();
	}
	
	
	@Override
	public Optional<TestimonialEntity> getDetailsById(int id) {
		return testimonialRepository.findById(id);
	}
	
	
	@Override
	public TestimonialEntity saveAllDetails(TestimonialEntity testimonialEntity) {
		return testimonialRepository.save(testimonialEntity);
	}

	
	@Override
	public TestimonialEntity updateAllDetails(TestimonialEntity testimonialEntity) {
		return testimonialRepository.save(testimonialEntity);
	}

	
	@Override
	public void deleteDetailsById(int id) {
		testimonialRepository.deleteById(id);
	}

}

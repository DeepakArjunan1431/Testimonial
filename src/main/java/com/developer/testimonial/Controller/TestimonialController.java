package com.developer.testimonial.Controller;
import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.developer.testimonial.Entity.TestimonialEntity;
import com.developer.testimonial.Service.TestimonialService;

@RestController
@RequestMapping("/testimonials")
public class TestimonialController {
	
	@Autowired
	public TestimonialService testimonialService;
	
	@GetMapping("/getAllDetails")
	public List<TestimonialEntity> getAllDetails(){
		return testimonialService.getAllDetails();
	}

	@GetMapping("{id}")
	public Optional<TestimonialEntity> getAllDetailsById(@PathVariable("id") int id){
		return testimonialService.getAllDetailsById(id);
	}
	
	@PostMapping
	public TestimonialEntity saveAllDetails(@RequestBody TestimonialEntity testimonialEntity) {
		return testimonialService.saveAllDetails(testimonialEntity);
	}
	
	@PutMapping
	public TestimonialEntity updateAllDetails(@RequestBody TestimonialEntity testimonialEntity) {
		return testimonialService.UpdateAllDetails(testimonialEntity);
	}
	
	@DeleteMapping("{id}")
	public void deleteAllDetails(@PathVariable("id") int id) {
		testimonialService.DeleteAllDetails(id);
	}
		
}

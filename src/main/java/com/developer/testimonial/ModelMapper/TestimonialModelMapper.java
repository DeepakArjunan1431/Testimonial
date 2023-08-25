package com.developer.testimonial.ModelMapper;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.developer.testimonial.Entity.TestimonialEntity;
import com.developer.testimonial.Model.TestimonialModel;

@Service
public class TestimonialModelMapper {

	public TestimonialEntity ConvertModelToEntity(TestimonialModel testimonialModel) {
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		TestimonialEntity e = new TestimonialEntity(
				testimonialModel.getId(),
				testimonialModel.getT_name(),
				testimonialModel.getT_img(),
				testimonialModel.getT_wrt_img(),
				false,
				t,
				t,
				false);
		return e;
		}
	
}

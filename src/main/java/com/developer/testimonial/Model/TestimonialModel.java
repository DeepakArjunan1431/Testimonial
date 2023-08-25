package com.developer.testimonial.Model;

import java.sql.Timestamp;

public class TestimonialModel {
	
	private int id;
	private String t_name;
	private String t_img;
	private String t_wrt_img;
	private Boolean active_status;
	private Timestamp created_on;
	private Timestamp updated_on;
	private Boolean isDeleted;
	
	
	public TestimonialModel() {
	}


	public TestimonialModel(int id, String t_name, String t_img, String t_wrt_img, Boolean active_status,
			Timestamp created_on, Timestamp updated_on, Boolean isDeleted) {
		super();
		this.id = id;
		this.t_name = t_name;
		this.t_img = t_img;
		this.t_wrt_img = t_wrt_img;
		this.active_status = active_status;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.isDeleted = isDeleted;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getT_name() {
		return t_name;
	}


	public void setT_name(String t_name) {
		this.t_name = t_name;
	}


	public String getT_img() {
		return t_img;
	}


	public void setT_img(String t_img) {
		this.t_img = t_img;
	}


	public String getT_wrt_img() {
		return t_wrt_img;
	}


	public void setT_wrt_img(String t_wrt_img) {
		this.t_wrt_img = t_wrt_img;
	}


	public Boolean getActive_status() {
		return active_status;
	}


	public void setActive_status(Boolean active_status) {
		this.active_status = active_status;
	}


	public Timestamp getCreated_on() {
		return created_on;
	}


	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}


	public Timestamp getUpdated_on() {
		return updated_on;
	}


	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}


	public Boolean getIsDeleted() {
		return isDeleted;
	}


	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	@Override
	public String toString() {
		return "TestimonialModel [id=" + id + ", t_name=" + t_name + ", t_img=" + t_img + ", t_wrt_img=" + t_wrt_img
				+ ", active_status=" + active_status + ", created_on=" + created_on + ", updated_on=" + updated_on
				+ ", isDeleted=" + isDeleted + "]";
	}
	
	
	
	

}

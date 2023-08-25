package com.developer.testimonial.Entity;



import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Testimonials")
public class TestimonialEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="t_name")
	private String t_name;
	
	@Column(name="t_img")
	private String t_img;
	
	@Column(name="t_wrt_msg")
	private String t_wrt_msg;
	
	@Column(name="active_status")
	private Boolean active_status;
	
	@Column(name="created_on")
	private Timestamp created_on;
	
	@Column(name="updated_on")
	private Timestamp updated_on;
	
	@Column(name="isDeleted")
	private Boolean isDeleted;
	
	public TestimonialEntity() {}

	public TestimonialEntity(int id, String t_name, String t_img, String t_wrt_msg, Boolean active_status,
			Timestamp created_on, Timestamp updated_on, Boolean isDeleted) {
		super();
		this.id = id;
		this.t_name = t_name;
		this.t_img = t_img;
		this.t_wrt_msg = t_wrt_msg;
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

	public String getT_wrt_msg() {
		return t_wrt_msg;
	}

	public void setT_wrt_msg(String t_wrt_msg) {
		this.t_wrt_msg = t_wrt_msg;
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
		return "HomeEntity [id=" + id + ", t_name=" + t_name + ", t_img=" + t_img + ", t_wrt_msg=" + t_wrt_msg
				+ ", active_status=" + active_status + ", created_on=" + created_on + ", updated_on=" + updated_on
				+ ", isDeleted=" + isDeleted + "]";
	}


}

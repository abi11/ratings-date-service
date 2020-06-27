package com.abhi.microservices.ratingsdateservice.models;

import java.util.Arrays;
import java.util.List;

public class UserRatings {

	
	 private String userId;
	 private List<Rating> userRating;
	 
	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	public UserRatings() {
	}
	 public void initData(String userId) {
	        this.setUserId(userId);
	        this.setUserRating(Arrays.asList(
	                new Rating("100", 3),
	                new Rating("200", 4)
	        ));
	    }
}

package com.travelmaker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.travelmaker.dto.TravelReview;



@Mapper
public interface TravelReviewMapper {
	public List<TravelReview> selectAllReview();
	
//	public UserDto selectOnceUser(String eamil);
//	public int deleteUser(String email);
//	public int updateUser(UserDto user);
//	public int insertUser(UserDto user);
//	public int countUserAdmin();

}

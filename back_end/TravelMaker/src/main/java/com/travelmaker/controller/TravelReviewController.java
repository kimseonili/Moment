package com.travelmaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.travelmaker.dto.TravelReview;
import com.travelmaker.service.TravelReviewService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class TravelReviewController {
	
	@Autowired
	private TravelReviewService travelReviewService;

	@RequestMapping(value = "/travelReview", method = RequestMethod.GET)
	@ApiOperation(value="모든 여행 리뷰 리턴")
	public List<TravelReview> selectAllReview() throws Exception {
		return travelReviewService.selectAllReview();
	}
	
	@RequestMapping(value = "/travelReviewTid/{tid}", method = RequestMethod.GET)
	@ApiOperation(value="동행에 해당하는 리뷰 리턴")
	public List<TravelReview> selectAllReviewByTid(@PathVariable int tid) throws Exception {
		return travelReviewService.selectAllReviewByTid(tid);
	}
	
	@RequestMapping(value ="/travelReview", method = RequestMethod.PUT)
	@ApiOperation(value="여행 리뷰 수정")
	public int updateReview(@RequestBody TravelReview tr) {
		return travelReviewService.updateReview(tr);
	}
	
	@RequestMapping(value = "/travelReview/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value="여행 리뷰 삭제")
	public int deleteReviewById(@PathVariable int id) {
		return travelReviewService.deleteReviewById(id);
	}

	@RequestMapping(value = "/travelReview", method = RequestMethod.POST)
	@ApiOperation(value="여행 리뷰 생성")
	public int insertReviewById(@RequestBody TravelReview tr) {
		return travelReviewService.insertReview(tr);
	}
}

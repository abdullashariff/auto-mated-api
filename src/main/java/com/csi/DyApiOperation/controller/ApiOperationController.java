package com.csi.DyApiOperation.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csi.DyApiOperation.dao.model.ApiMetaData;
import com.csi.DyApiOperation.dao.model.ApiResponseData;
import com.csi.DyApiOperation.dao.repository.APIMetaDataRepository;
import com.csi.DyApiOperation.dao.repository.ApiResponseRepository;
import com.csi.DyApiOperation.dto.CreateAPIRequest;
import com.csi.DyApiOperation.dto.StoreDataRequest;

@RestController
public class ApiOperationController {

	@Autowired
	ApiResponseRepository apiResponseRepository;

	@Autowired
	APIMetaDataRepository apiMetaDataRepository;

	@RequestMapping(name = "/createApi", method = RequestMethod.POST)
	public String createApi(@RequestBody CreateAPIRequest createAPIRequest, @RequestHeader("accept") String acceptHeader) {

		//validate access token
		
		//

		ApiMetaData apiMetaData = new ApiMetaData();

		BeanUtils.copyProperties(apiMetaData, createAPIRequest);

		apiMetaDataRepository.save(apiMetaData);
		
		//based on accept header return json or xml

		return "createApi";
	}

	@RequestMapping(name = "/insertData", method = RequestMethod.PUT)
	public String insertData(@RequestBody StoreDataRequest StoreDataRequest,@RequestHeader("accept") String acceptHeader) {
		
		//validate access token
		
		//validate userid with api id
				
		ApiResponseData apiResponseData = new ApiResponseData();

		BeanUtils.copyProperties(apiResponseData, StoreDataRequest);

		apiResponseRepository.save(apiResponseData);
		
		//based on accept header return json or xml
		
		return "insertData";
	}

	@RequestMapping(name = "/fetchData/{userId}", method = RequestMethod.GET)
	public String fetchData(@PathVariable("userId") int userId, @RequestHeader("accept") String acceptHeader) {

		//validate access token
		
		//get api by userId
		apiMetaDataRepository.findByUserId(userId);
		
		//based on accept header return json or xml
		
		return "fetchData";
	}

}

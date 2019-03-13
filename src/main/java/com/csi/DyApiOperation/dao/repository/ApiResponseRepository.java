package com.csi.DyApiOperation.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.DyApiOperation.dao.model.ApiResponseData;

public interface ApiResponseRepository extends JpaRepository<ApiResponseData, Integer>{

}

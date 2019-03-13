package com.csi.DyApiOperation.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.DyApiOperation.dao.model.ApiMetaData;

public interface APIMetaDataRepository extends JpaRepository<ApiMetaData, Integer> {

	List<ApiMetaData> findByUserId(int userId);
}

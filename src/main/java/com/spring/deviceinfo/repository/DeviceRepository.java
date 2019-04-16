package com.spring.deviceinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.deviceinfo.entity.DeviceInfo;


public interface DeviceRepository extends JpaRepository<DeviceInfo, Long> {


}

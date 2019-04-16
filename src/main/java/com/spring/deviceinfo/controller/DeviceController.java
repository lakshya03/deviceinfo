package com.spring.deviceinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.deviceinfo.entity.DeviceInfo;
import com.spring.deviceinfo.repository.DeviceRepository;



@RequestMapping("/rest")
@RestController
public class DeviceController {

	@Autowired
    private DeviceRepository deviceinfoRepository;
	
    @PostMapping(value="/check")
	public DeviceInfo persi(@RequestBody final DeviceInfo deviceinfo)
	{
    	return deviceinfoRepository.save(deviceinfo);
	}

}
package com.spring.deviceinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "deviceInfo", catalog = "device")
public class DeviceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vzid")
    private Long id;
    private String uuid;
    @NotNull 
    private String cordova;
    private String model;
    private String platform;
    private String version;
    private String manufacturer;
    private Boolean isVirtual;
    private String serial;
	public DeviceInfo() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCordova() {
		return cordova;
	}
	public void setCordova(String cordova) {
		this.cordova = cordova;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Boolean getIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
}

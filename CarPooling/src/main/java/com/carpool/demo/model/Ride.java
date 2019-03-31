package com.carpool.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Ride {
	
	@Id
	@GeneratedValue
	private int id;
	private String vehiclenameno;
	private String vehiclename;

	@ManyToOne
	private Driver driver;
	private int seats;
	private double price;
	private String destination;
	private String source;
	private String depttime;
	private Date deptdate;
	private boolean womenonly;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehiclenameno() {
		return vehiclenameno;
	}
	public void setVehiclenameno(String vehiclenameno) {
		this.vehiclenameno = vehiclenameno;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDepttime() {
		return depttime;
	}
	public void setDepttime(String depttime) {
		this.depttime = depttime;
	}
	public Date getDeptdate() {
		return deptdate;
	}
	public void setDeptdate(Date deptdate) {
		this.deptdate = deptdate;
	}
	public boolean isWomenonly() {
		return womenonly;
	}
	public void setWomenonly(boolean womenonly) {
		this.womenonly = womenonly;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ride [id=" + id + ", vehiclenameno=" + vehiclenameno + ", vehiclename=" + vehiclename + ", driver="
				+ driver + ", seats=" + seats + ", price=" + price + ", destination=" + destination + ", source="
				+ source + ", depttime=" + depttime + ", deptdate=" + deptdate + ", womenonly=" + womenonly
				+ ", status=" + status + "]";
	}

}

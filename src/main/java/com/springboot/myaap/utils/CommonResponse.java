package com.springboot.myaap.utils;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CommonResponse {
	
      private Timestamp timestamp;
      private String message;
      private Integer status;
      private Object data;
      
//	public Timestamp getTimestamp() {
//		return timestamp;
//	}
//	public void setTimestamp(Timestamp timestamp) {
//		this.timestamp = timestamp;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	public Integer getStatus() {
//		return status;
//	}
//	public void setStatus(Integer status) {
//		this.status = status;
//	}
//	public Object getData() {
//		return data;
//	}
//	public void setData(Object data) {
//		this.data = data;
//	}
//	public CommonResponse(Timestamp timestamp, String message, Integer status, Object data) {
//		super();
//		this.timestamp = timestamp;
//		this.message = message;
//		this.status = status;
//		this.data = data;
//	}
	
      
      

}

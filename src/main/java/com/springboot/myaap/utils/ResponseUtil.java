package com.springboot.myaap.utils;

import java.sql.Timestamp;


public class ResponseUtil {
	
	public static CommonResponse prepareSuccessResponse(Object data) {
		
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());


		return new CommonResponse(timestamp,"Request Completed Successfully",200,data);
	}

}

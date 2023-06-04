package com.springboot.myapp.query;

public interface AdminQueryMetaData {

	String GET_USER_BY_USER_ID = "SELECT \r\n"
			+ "au.USER_ID, \r\n"
			+ "au.USER_EMAIL, \r\n"
			+ "au.FIRST_NAME, \r\n"
			+ "au.LAST_NAME, \r\n"
			+ "au.MOB,au.USER_PASS\r\n"
			+ " from admin.admin_user au WHERE au.USER_ID = ?1";
	String GET_USER_DTL = "SELECT \r\n"
			+ "au.USER_ID, \r\n"
			+ "au.USER_EMAIL, \r\n"
			+ "au.FIRST_NAME, \r\n"
			+ "au.LAST_NAME, \r\n"
			+ "au.MOB,au.USER_PASS \r\n"
			+ "from admin.admin_user au";
	String GET_USER_DTL_COUNT = "\r\n"
			+ "SELECT \r\n"
			+ "COUNT(*)\r\n"
			+ "from admin.admin_user au";
}

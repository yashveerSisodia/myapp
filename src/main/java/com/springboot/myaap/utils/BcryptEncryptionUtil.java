package com.springboot.myaap.utils;



import org.mindrot.jbcrypt.BCrypt;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component	
public class BcryptEncryptionUtil {
	
//	  @Bean
//	    public BcryptEncryptionUtil bcryptEncryptionUtil() {
//	        return new BcryptEncryptionUtil();
//	    }

	public String hashPassword(String password) {
		String hashPass = BCrypt.hashpw(password, BCrypt.gensalt());
		return hashPass;
	}
	
	public Boolean checkPass(String plainPass, String hashedPass) {
		
		if(BCrypt.checkpw(plainPass, hashedPass)) {
			return true;
		}else
			return false; 
		
	}

}

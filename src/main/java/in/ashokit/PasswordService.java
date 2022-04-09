package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	int i=10;
       int k=0;
         String name="Sushir";
	public static   String encode(String str) {
		           Encoder encoder= Base64.getEncoder();
		           
		return encoder.encodeToString(str.getBytes());
		
	}
	
	public static String decode(String str) {
		Decoder decoder = Base64.getDecoder();
		       byte[] decode=decoder.decode(str);
		return new String(decode);
	}

}

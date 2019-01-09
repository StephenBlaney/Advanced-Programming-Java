package cypher;

public class Decoder {

public static String decrypt(String key){
	String result = "";
	int code = key.length();
	char ch;
	
	for(int i = 0; i < code; i++){
		ch = key.charAt(i);
		ch -= 10;
		result +=ch;
		
		}

		return result;
	}
}
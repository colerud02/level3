package encryption;

import java.io.IOException;

public class EncryptedCommunication {
	
	private static Encrypter encrypter = new Encrypter();
	//private Decrypter decrypter = new Decrypter();
	
	public static void main(String[] args) {
		try {
			encrypter.createMappingFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		String mytext = "jack loves to play half life all day and night.";
		//System.out.println(""+mytext);
		String encryptedtxt = encrypter.encrypt(mytext);
		System.out.println(""+encryptedtxt);
	}
	
}

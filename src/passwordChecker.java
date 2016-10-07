import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class passwordChecker {
	int uppercase = 2;
	int numbers = 2;
	int specialCharacter = 1;
	int length =1;
public static void main(String[] args) {
	passwordChecker pc = new passwordChecker();
	
}
public passwordChecker() {
	isValidPaasword("12@#ADha");
}
public boolean isValidPaasword(String pw){
	//return true if pw has
	//2 uppercase letters, 2 numbers, 1 special character
	//and is between 8-10 characters
	for (int i = 0; i < pw.length(); i++) {
		if (pw.charAt(i) == 33 ||pw.charAt(i) == 35 || pw.charAt(i) ==36 ||pw.charAt(i) == 37 || pw.charAt(i) ==38 || pw.charAt(i) ==40 || pw.charAt(i) ==41 || pw.charAt(i) ==42 || pw.charAt(i) ==64 ||pw.charAt(i) == 94) {
			specialCharacter -=1;
			System.out.println("Character found!");
		}
		if (Character.isDigit(pw.charAt(i))) {
			numbers -=1;
			System.out.println("Number found!");
		}
		if (Character.isUpperCase(pw.charAt(i))){
			uppercase -=1;
			System.out.println("Uppercase letter found!");
		}
		if (pw.length() >8 && pw.length()<10) {
			length -=1;
			System.out.println("Length is ok!");
		}
		else{
			
		}
	}
		
	
	return false;
	
}
}
// ! = 33/
// @ = 64/
// # = 35/
// $ = 36/
// % = 37/
// ^ = 94/
// & = 38/
// * = 42/
// ( = 40/
// ) = 41/
// 33,35,36,37,38,40,41,42,64,94
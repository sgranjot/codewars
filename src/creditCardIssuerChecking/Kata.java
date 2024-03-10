package creditCardIssuerChecking;

public class Kata {

	public static String getIssuer(String cardNumber) {
		
		if(cardNumber.matches("^[3][47]\\d{13}$")) return "AMEX";
		if(cardNumber.matches("^[6][0][1][1]\\d{12}$")) return "Discover";
		if(cardNumber.matches("^[5][12345]\\d{14}$")) return "Mastercard";
		if(cardNumber.matches("(^[4]\\d{12}$)|(^[4]\\d{15}$)")) return "VISA";
		return "Unknown";
		
	}

}


/*

| Card Type  | Begins With          | Number Length |
|------------|----------------------|---------------|
| AMEX       | 34 or 37             | 15            |
| Discover   | 6011                 | 16            |
| Mastercard | 51, 52, 53, 54 or 55 | 16            |
| VISA       | 4                    | 13 or 16      |
Examples
getIssuer(4111111111111111) == "VISA"
getIssuer(4111111111111) == "VISA"
getIssuer(4012888888881881) == "VISA"
getIssuer(378282246310005) == "AMEX"
getIssuer(6011111111111117) == "Discover"
getIssuer(5105105105105100) == "Mastercard"
getIssuer(5105105105105106) == "Mastercard"
getIssuer(9111111111111111) == "Unknown"

*/
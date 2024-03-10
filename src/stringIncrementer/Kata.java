package stringIncrementer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
/*
	public static String incrementString(String s) {
	    // Si la cadena está vacía, retornar "1"
	    if (s.isEmpty()) {
	        return "1";
	    }
	    // Encontrar el último dígito que no sea cero en la cadena
	    int lastIndex = s.length() - 1;
	    while (lastIndex >= 0 && Character.isDigit(s.charAt(lastIndex))) {
	        lastIndex--;
	    }
	    // Si no hay ningún dígito que no sea cero, agregar un "1" al inicio y retornar
	    if (lastIndex == s.length() - 1) {
	        return s + "1";
	    }
	    // Incrementar el último dígito que no sea cero y retornar
	    String prefix = s.substring(0, lastIndex + 1);
	    String suffix = s.substring(lastIndex + 1);
	    int carry = 1;
	    StringBuilder sb = new StringBuilder();
	    for (int i = suffix.length() - 1; i >= 0; i--) {
	        char c = suffix.charAt(i);
	        if (carry > 0) {
	            if (c == '9') {
	                sb.append('0');
	            } else {
	                sb.append((char)(c + 1));
	                carry = 0;
	            }
	        } else {
	            sb.append(c);
	        }
	    }
	    if (carry > 0) {
	        sb.append('1');
	    }
	    sb.reverse();
	    return prefix + sb.toString();
	}
	*/
	
	public static String incrementString(String s) {
		
		Pattern pattern = Pattern.compile("^[A-Za-z0]*");
		Matcher matcher = pattern.matcher(s);
		matcher.find();
		String firstPart = matcher.group();
		String secondPart= s.replaceAll("^[A-Za-z0]*", "");
		int suffix; 
		
		if(secondPart.equals("") && firstPart.endsWith("0")){
			return (firstPart.substring(0, firstPart.length()-1)+"1");
		}else if (secondPart.equals("") && !firstPart.endsWith("0")) {
			return firstPart + "1";
		}
		else {
			suffix= Integer.valueOf(s.replaceAll("^[A-Za-z0]*", ""))+1;
		}
		return firstPart + String.valueOf(suffix);
	}

}

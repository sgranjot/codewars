package convertAhexStringToRGB;

public class HexToRGB {
	
	public static int[] hexStringToRGB(String hex) {
		
		String a="";
		String b="";
		String c="";
		String d="";
		String e="";
		String f="";

		int[] rgb = new int [3];

		a = String.valueOf(hex.charAt(1)).toLowerCase();
		if(a.equals("a")) a ="10";
		if(a.equals("b")) a ="11";
		if(a.equals("c")) a ="12";
		if(a.equals("d")) a ="13";
		if(a.equals("e")) a ="14";
		if(a.equals("f")) a ="15";
		
		b =  String.valueOf(hex.charAt(2)).toLowerCase();
		if(b.equals("a")) b ="10";
		if(b.equals("b")) b ="11";
		if(b.equals("c")) b ="12";
		if(b.equals("d")) b ="13";
		if(b.equals("e")) b ="14";
		if(b.equals("f")) b ="15";
		
		c =  String.valueOf(hex.charAt(3)).toLowerCase();
		if(c.equals("a")) c ="10";
		if(c.equals("b")) c ="11";
		if(c.equals("c")) c ="12";
		if(c.equals("d")) c ="13";
		if(c.equals("e")) c ="14";
		if(c.equals("f")) c ="15";
		
		d = String.valueOf(hex.charAt(4)).toLowerCase();
		if(d.equals("a")) d ="10";
		if(d.equals("b")) d ="11";
		if(d.equals("c")) d ="12";
		if(d.equals("d")) d ="13";
		if(d.equals("e")) d ="14";
		if(d.equals("f")) d ="15";
		
		e = String.valueOf(hex.charAt(5)).toLowerCase();
		if(e.equals("a")) e ="10";
		if(e.equals("b")) e ="11";
		if(e.equals("c")) e ="12";
		if(e.equals("d")) e ="13";
		if(e.equals("e")) e ="14";
		if(e.equals("f")) e ="15";
		
		f =  String.valueOf(hex.charAt(6)).toLowerCase();
		if(f.equals("a")) f ="10";
		if(f.equals("b")) f ="11";
		if(f.equals("c")) f ="12";
		if(f.equals("d")) f ="13";
		if(f.equals("e")) f ="14";
		if(f.equals("f")) f ="15";

		rgb[0]=HexToRGB.red(a,b);
		rgb[1]=HexToRGB.green(c,d);
		rgb[2]=HexToRGB.blue(e,f);

		return rgb; 
	}

	
	public static int red(String a, String b) {
		return (Integer.parseInt(a) * 16 + (Integer.parseInt(b)));

	}

	
	public static int green(String c, String d) {
		return (Integer.parseInt(c)) * 16 + (Integer.parseInt(d));

	}
	

	public static int blue(String e, String f) {
		return (Integer.parseInt(e)) * 16 + (Integer.parseInt(f));

	}



}

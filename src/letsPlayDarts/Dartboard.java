package letsPlayDarts;

public class Dartboard {

	public String getScore(double x, double y) {
		
		String numberType = "";
		String number;
		
		//sides of isosceles triangle formed by distance between center and x,y and the distance between center and the same radio
		double side = Dartboard.distance(0, 0, x, y);
		double base = Dartboard.distance(0, side, x, y);
		
		//angle formed by the two equals sides of the triangle
		double angle = Math.toDegrees(Math.acos((2*Math.pow(side, 2) - Math.pow(base, 2)) / (2*Math.pow(side, 2))));
		if(x<0) angle = 360 - angle;
		
		//modifiers
		if(side >= 99 && side <= 107) numberType = "T";
		if(side >= 162 && side < 170) numberType = "D";
		
		
		//scores
		if(side <= 6.35) return "DB";
		if(side > 6.35 && side <= 15.9) return "SB";
		if(side >= 170) return "X";
		
		number="20";
		if(angle>9 && angle<27) number="1";
		if(angle>27 && angle<45) number="18";
		if(angle>45 && angle<63) number="4";
		if(angle>63 && angle<81) number="13";
		if(angle>81 && angle<99) number="6";
		if(angle>99 && angle<117) number="10";
		if(angle>117 && angle<135) number="15";
		if(angle>135 && angle<153) number="2";
		if(angle>153 && angle<171) number="17";
		if(angle>171 && angle<189) number="3";
		if(angle>189 && angle<207) number="19";
		if(angle>207 && angle<225) number="7";
		if(angle>225 && angle<243) number="16";
		if(angle>243 && angle<261) number="8";
		if(angle>261 && angle<279) number="11";
		if(angle>279 && angle<297) number="14";
		if(angle>297 && angle<315) number="9";
		if(angle>315 && angle<333) number="12";
		if(angle>333 && angle<351) number="5";
	
		return numberType+number;
	}
	
	//function that calculates the distance between two points(a,b) and (c,d)
	private static double distance (double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}


/*

Possible scores are:
Outside of the board: `"X"`
Bull's eye: `"DB"`
Bull: `"SB"`
A single number, example: `"10"`
A triple number: `"T10"`
A double number: `"D10"`

The diameters of the circles on the dartboard are:
Bull's eye: `12.70 mm`
Bull: `31.8 mm`
Triple ring inner circle: `198 mm`
Triple ring outer circle: `214 mm`
Double ring inner circle: `324 mm`
Double ring outer circle: `340 mm`

*/
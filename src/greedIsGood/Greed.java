package greedIsGood;

public class Greed {
	
	
	public static int greedy(int[] dice){

		int one=0;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		
		
		
		for(int i : dice) {
			switch(i) {
			case 6:
				six++;
          break;
			case 5:
				five++;
          break;
			case 4:
				four++;
          break;
			case 3:
				three++;
          break;
			case 2:
				two++;
          break;
			case 1:
				one++;
          break;
			}
		}
    		
		if(two>=3) two=200; else two=0;
		if(three>=3) three=300; else three=0;
		if(four>=3) four=400; else four=0;
		if(six>=3) six =600; else six=0;
		
		if(one>=3) {
			one = ((3-one) * (-100)) + 1000;
		}else {
			one = one*100;
		}
		
		if(five>=3) {
			five = ((3-five) * (-50)) + 500;
		}else {
			five = five*50;
		}
		
		
	    return one+two+three+four+five+six;
	  }

}

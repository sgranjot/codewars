package humanReadableDurationFormat;

public class TimeFormatter {

	public static String formatDuration(int seconds) {
		
		if(seconds==0) return "now";
		
		int countComa=0;
		StringBuilder sb= new StringBuilder("");
		int indexOfComa=0;
		int coma=0;
		
		
		int years = seconds/31536000;	//31536000 seconds in a year
		
		seconds%=31536000;
		int days = seconds/86400;		//86400 seconds in a day
		
		seconds%=86400;
		int hours = seconds/3600;		//3600 seconds in an hour
		
		seconds%=3600;
		int minutes = seconds/60;		//60 seconds in a minute
		
		seconds%=60;
		
		
		if(years>0) {countComa++;}
		if(days>0) {countComa++;}
		if(hours>0) {countComa++;}
		if(minutes>0) {countComa++;}
		if(seconds>0) {countComa++;}
		
		if(years==1) sb.append("1 year,");
		if(years>1) sb.append(years+" years,");
		if(days==1) sb.append("1 day,");
		if(days>1) sb.append(days+" days,");
		if(hours==1) sb.append("1 hour,");
		if(hours>1) sb.append(hours+" hours,");
		if(minutes==1) sb.append("1 minute,");
		if(minutes>1) sb.append(minutes+" minutes,");
		if(seconds==1) sb.append("1 second,");
		if(seconds>1) sb.append(seconds+" seconds,");
		
		
		
		if(countComa>1){
			int i = -1;
			while(coma < countComa-1) {
				i++;
				if(sb.charAt(i)==',') {
					indexOfComa=i;
					coma++;
				}
			}	
			sb.replace(indexOfComa, indexOfComa+1, " and ");
		}
		
		
		if(sb.charAt(sb.length()-1)==',') {
			sb.deleteCharAt(sb.length()-1);
		}
	
		return sb.toString().replaceAll(",", ", ");
	
	}

}

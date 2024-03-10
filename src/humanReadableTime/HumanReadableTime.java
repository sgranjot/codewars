package humanReadableTime;

public class HumanReadableTime {

	public static String makeReadable(int seconds) {

		String hours = Integer.toString(seconds / 3600); // 3600 seconds in an hour
		if (hours.length() == 1)
			hours = "0" + hours;

		seconds %= 3600;
		String minutes = Integer.toString(seconds / 60); // 60 seconds in a minute
		if (minutes.length() == 1)
			minutes = "0" + minutes;

		seconds %= 60;
		String sec = Integer.toString(seconds);
		if (sec.length() == 1)
			sec = "0" + sec;

		StringBuilder sb = new StringBuilder();

		return sb.append(hours + ":" + minutes + ":" + sec).toString();

	}

}

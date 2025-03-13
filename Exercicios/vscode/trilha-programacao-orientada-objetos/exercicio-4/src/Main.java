public class Main {
	public static void main(String[] args) throws Exception {
		Clock brlClock = new BRLClock();
		brlClock.setSecond(0);
		brlClock.setMinute(0);
		brlClock.setHour(13);
		System.out.println(brlClock.getTime()); // 24:0:0
		System.out.println(new USClock().convert(brlClock).getTime()); // 12:0:0 AM
	}
}

package tw.com.jimmy.studio;

public class Util {
	public static int getRandomNum() {
		// -100 < randomNum < 100
		double randomDouble = (Math.random() * 200);
		int randomNum = (int) Math.round(randomDouble - 100.0);
		// System.out.println("randomNum: " + randomNum);
		return randomNum;
	}
}

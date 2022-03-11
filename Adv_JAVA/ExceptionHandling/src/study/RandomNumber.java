package study;

import java.util.Random;

public class RandomNumber {

	int uppercap;

	@Override
	public String toString() {
		return "The uppercap is " + uppercap;
	}

	public RandomNumber(int uppercap) {

		this.uppercap = uppercap;
	}

	public int getRandomNumber() {
		Random r = new Random();

		int rn = r.nextInt(uppercap);
		return rn;

	}

}

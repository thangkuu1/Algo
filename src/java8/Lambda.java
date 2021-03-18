package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Lambda {
	
	public static void main(String[] args) {
		NumberUtil num = new NumberUtil();
		int randVal = num.getRandomValue(
				() -> {
					Random random = new Random();
					return random.nextInt(500);
				}
		);
		System.out.println("random value: " + randVal);
	}

	private static class NumberUtil{
		public int getRandomValue(Supplier<Integer> supplier) {
			return supplier.get();
		}
	}
}

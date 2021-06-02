package calc;

import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float square(float num1) {
		return (float)Math.pow(num1, 2.0);
	}

	public static float cube(float num1) {
		return (float)Math.pow(num1, 3.0);
	}

	public static float power(float num1, float num2) {
		return (float)Math.pow(num1, num2);
	}

	public static float mod(float num1, float num2) {
		return num1 % num2;
	}

	public static float rand(float num1, float num2) {
		int newNum1 = (int) num1;
		int newNum2 = (int) num2;

		return ThreadLocalRandom.current().nextInt(newNum1, newNum2 + 1);
	}

	public static float multiplyCubes(float num1, float num2) {
		return cube(num1) * cube(num2);
	}
}
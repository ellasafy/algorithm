package com.algorithm.all;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {

	/**
	 * 求n的平方根
	 * @param n
	 * @return
	 */
	
    private static int squareRoot(int number) {
			int index = 0, x0 = 0, x1 = 0;
			// the init x0 range from.
			int map[] = { 1, 1 << 2, 1 << 4, 1 << 6, 1 << 8, 1 << 10, 1 << 12,
					1 << 14, 1 << 16, 1 << 18, 1 << 20, 1 << 22, 1 << 24, 1 << 26,
					1 << 28, 1 << 30, };

			while (map[index] < number && index != 16) {
				++index;
			}
			x0 = 1 << index;
			// NewTown solution
			while (x0 != 0) {
				x1 = (int) (0.5 * (x0 + number / x0));
				if (x1 >= x0) {
					break;
				}
				x0 = x1;
			}
			return x0;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while (in.hasNext()) {
				try {
					int inputNumber = in.nextInt();

					if (inputNumber < 1 || inputNumber > 1000000) {
						throw new IllegalArgumentException();
					}
					int root = squareRoot(inputNumber);
					// System.out.println("root is :"+root);
					if (inputNumber == root * root) {
						System.out.println(root);
					}
				} catch (InputMismatchException e) {
					throw new IllegalArgumentException();
				}
			}
		}
}

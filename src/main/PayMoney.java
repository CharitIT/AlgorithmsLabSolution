package main;

import java.util.Scanner;

public class PayMoney {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target to be achieved");
		int targetValue = sc.nextInt();
		while (targetValue-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextLong();
			long sumTranscation = 0;
			for (int i = 0; i < size; i++) {
				sumTranscation = sumTranscation + arr[i];
				if (sumTranscation >= target) {
					System.out.println("Target achieved after  " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}
}
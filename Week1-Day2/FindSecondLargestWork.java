package week1.day2;

import java.util.Arrays;

public class FindSecondLargestWork {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 11, 4, 6, 9 };

		Arrays.sort(nums);
		System.out.println(nums[nums.length - 2]);

	}
}

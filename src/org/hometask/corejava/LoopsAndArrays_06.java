package org.hometask.corejava;

public class LoopsAndArrays_06 {

	//Problem 1
	public int maxSpan(int[] nums) {
		int maxSpan = 0;
		int span;
		int j;

		for (int i = 0; i < nums.length; i++) {
			for (j = nums.length - 1; nums[i] != nums[j]; j--)
				;
			span = 1 + j - i;
			if (span > maxSpan) {
				maxSpan = span;
			}
		}
		return maxSpan;
	}

	//Problem 2
	public boolean canBalance(int[] n) {
		
		int lSum = 0;
		for (int i = 0; i < n.length; i++) {
			lSum += n[i];
			int rSum = 0;
			for (int j = n.length - 1; j > i; j--) {
				rSum += n[j];
			}
			if (rSum == lSum)
				return true;
		}
		return false;
	}
	
	//Problem 3 
	public int countClumps(int[] nums) {

		boolean match = false;
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && !match) {
				match = true;
				count++;
			} else if (nums[i] != nums[i + 1]) {
				match = false;
			}
		}
		return count;
	}
	
	//Problem-4
	public int maxMirror(int[] nums) {
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
				if (nums[i + count] == nums[j]) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 0;
				}
			}
			max = Math.max(max, count);
		}
		return max;
	}


	public static void main(String[] args) {
		//Problem 1- Inputs
		int[] nums1= {1, 2, 1, 1, 3};
		int[] nums2= {1, 4, 2, 1, 4, 1, 4};
		int[] nums3= {1, 4, 2, 1, 4, 4, 4};
		
		//Problem-2 Inputs
		int[] n1= {1, 1, 1, 2, 1};
		int[] n2= {2, 1, 1, 2, 1};
		int[] n3= {10, 10};
		
		//Problem-3 Inputs
		int[] no1= {1, 2, 2, 3, 4, 4};
		int[] no2= {1, 1, 2, 1, 1};
		int[] no3= {1, 1, 1, 1, 1};
		
		//Problem-3 Inputs
		int[] in1= {1, 2, 3, 8, 9, 3, 2, 1};
		int[] in2= {1, 2, 1, 4};
		int[] in3= {7, 1, 2, 9, 7, 2, 1};
		
		LoopsAndArrays_06 la= new LoopsAndArrays_06();
		//Problem-1 Outputs
		System.out.println(la.maxSpan(nums1));
		System.out.println(la.maxSpan(nums2));
		System.out.println(la.maxSpan(nums3));
		
		//Problem-2 Outputs
		System.out.println(la.canBalance(n1));
		System.out.println(la.canBalance(n2));
		System.out.println(la.canBalance(n3));
		
		//Problem-3 Outputs
		System.out.println(la.countClumps(no1));
		System.out.println(la.countClumps(no2));
		System.out.println(la.countClumps(no3));
		
		//Problem-4 Outputs
		System.out.println(la.maxMirror(in1));
		System.out.println(la.maxMirror(in2));
		System.out.println(la.maxMirror(in3));
	}
}

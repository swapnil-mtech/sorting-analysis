package com.swapnil.adsa1.algo;

import com.swapnil.adsa1.util.SortUtil;

public class ShellSort extends Sortable {

	 public static void main(String[] args) {
	        Sortable sortable = new ShellSort();
	        int[] input = {2, 0, 0, 2, 1, 4, 7, 0, 0, 4};

	        System.out.println("\nBefore Sort : ");
	        SortUtil.display(input);

	        sortable.sort(input);

	        System.out.println("\nAfter Sort : ");
	        SortUtil.display(input);
	    }
	 
	@Override
	public void sort(int[] inputArray) {
		super.sort(inputArray);

		shellSort();
	}

	private void shellSort() {
		int increment = length / 2;
		while (increment > 0) {
			for (int i = increment; i < length; i++) {
				int j = i;
				int temp = inputArray[i];
				while (j >= increment && inputArray[j - increment] > temp) {
					inputArray[j] = inputArray[j - increment];
					j = j - increment;
				}
				inputArray[j] = temp;
			}
			if (increment == 2)
				increment = 1;
			else
				increment *= (5.0 / 11);
		}
	}
}

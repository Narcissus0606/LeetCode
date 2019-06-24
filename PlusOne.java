package com.edu.sut.tys06;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = {1,2,1};
		PlusOne plusOne = new PlusOne();
		plusOne.plusOne(digits);
		for (int i : digits) {
			System.out.print(i);
		}		
	}
	
	public int[] plusOne(int[] digits) {
		int len = digits.length;
		int count = 0;
		for(int i = len-1;i > 0;i--){
			if(digits[i] == 9){
				digits[i] = 0;
				count++;
			}else{
				digits[i] = digits[i] + 1;
				break;
			}
		}	
		if(count == len - 1){
			if(digits[0] == 9){
				int[] new_digits = new int[len+1];
				new_digits[0] = 1;
				for (int i = 1; i < len+1; i++) {
					new_digits[i] = 0;
				}
				return new_digits;
			}else{
				int[] new_digits = new int[len];
				new_digits[0] = digits[0] + 1;
				for (int i = 1; i < len; i++) {
					new_digits[i] = digits[i];
				}
				return new_digits;
			}		
		}else{
			return digits;
		}
	}

}

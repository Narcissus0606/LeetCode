package com.edu.sut.tys06;

public class TrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrailingZeroes trailingZeroes = new TrailingZeroes();
		System.out.println(trailingZeroes.trailingZeroes(6));
		
	}
	//5!=1*2*3*4*5     1
	//6!=1*2*3*4*5*6   1
	//10!=1*2*3*4*5*6*7*8*9*10  2
	//关键点:1.2*5才能产生一个尾数0;
    //	     2.因子2多余因子5,所以找因子5的个数即可 		
    public int trailingZeroes(int n) {
    	int count = 0;
	    while(n >= 5) {
	        count += n / 5;
	        n /= 5;
	    }
	    return count;
    }

}

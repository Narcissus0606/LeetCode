package com.edu.sut.tys06;

public class Tile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String tiles = "ABCAAABBCCC";
		int len = tiles.length();
	    char[] letters = new char[len];
	    for(int i = 0;i < len;i++){
	    	letters[i] = tiles.charAt(i);
	    }
	    int num1 = len;
	    int num2 = 0;
	    for(int i = 0;i < len-1;i++){
			for(int j = i+1;j < len;j++){
				if(letters[i] == letters[j]){
					num1--;
					
					letters[i] = ' ';
				}
			}
		}
	    System.out.println(len);
	    System.out.println(num1);
	    System.out.println(num2);
	}
	public int numTilePossibilities(String tiles) {
	    int len = tiles.length();
	    char[] letters = new char[len];
	    for(int i = 0;i < len;i++){
	    	letters[i] = tiles.charAt(i);
	    }
	    int num1 = len;
	    int num2 = 0;
	    for(int i = 0;i < len-1;i++){
			for(int j = i+1;j < len;j++){
				if(letters[i] == letters[j]){
					num1--;
				}
			}
		}
	    
	    
	    
		
		
		return 0;
	}
}

package com.edu.sut.tys07;


public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLastWord lastWord = new LengthOfLastWord();
		System.out.println(lastWord.lengthOfLastWord("a"));
	}

	
	public int lengthOfLastWord(String s) {
        int num = 0;
        if (s == " ") {
        	return 0;
		} else {
			String[] word = s.split(" ");
			if (word.length-1 >= 0) {
				num = word[word.length-1].length();
			}
		}
        return num;
    }
	
}

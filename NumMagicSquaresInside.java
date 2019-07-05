package com.edu.sut.tys07;

import java.util.HashMap;
import java.util.Map;

public class NumMagicSquaresInside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] grid = {{7,0,5},{2,4,6},{3,8,1}};
		NumMagicSquaresInside numMagicSquaresInside = new NumMagicSquaresInside();
		System.out.println(numMagicSquaresInside.numMagicSquaresInside(grid));
	}
	
	//1 <= grid.length <= 10
	//1 <= grid[0].length <= 10
	//0 <= grid[i][j] <= 15

	
	/*±©Á¦·¨
	 * public int numMagicSquaresInside(int[][] grid) {
	    if(grid.length<3 && grid[0].length<3) {
	    	return 0;
	    }else{
	    	int count = 0;
			int[][] temp = new int[3][3];
			for (int i = 0; i < grid.length-2; i++) {
				for (int j = 0; j < grid[0].length-2; j++) {
					int sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8 = 0;
					temp[0][0]=grid[i][j];temp[0][1]=grid[i][j+1];temp[0][2]=grid[i][j+2];
					temp[1][0]=grid[i+1][j];temp[1][1]=grid[i+1][j+1];temp[1][2]=grid[i+1][j+2];
					temp[2][0]=grid[i+2][j];temp[2][1]=grid[i+2][j+1];temp[2][2]=grid[i+2][j+2];
					sum1 = temp[0][0] + temp[0][1] + temp[0][2];
					sum2 = temp[1][0] + temp[1][1] + temp[1][2];
					sum3 = temp[2][0] + temp[2][1] + temp[2][2];
					sum4 = temp[0][0] + temp[1][0] + temp[2][0];
					sum5 = temp[0][1] + temp[1][1] + temp[2][1];
					sum6 = temp[0][2] + temp[1][2] + temp[2][2];
					sum7 = temp[0][0] + temp[1][1] + temp[2][2];
					sum8 = temp[2][0] + temp[1][1] + temp[0][2];
					int flag = 0;
					Map<Integer, Integer> numMap = new HashMap<>();
					for (int k = 0; k < 3; k++) {
						for (int k2 = 0; k2 < 3; k2++) {
							if(numMap.containsKey(temp[k][k2])){
								flag++;
							}else if(0>=temp[k][k2]||temp[k][k2]>9){
								flag++;
							}else {
								numMap.put(temp[k][k2], 1);
							}
						}
					}
					if(flag ==0 && sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6 && sum6 == sum7 && sum7 == sum8){
						count = count + 1;
					}
				}
			}
			return count;
	    }
		
	}*/

	public int numMagicSquaresInside(int[][] grid) {
	    int count = 0;
	    boolean f = false;
	    for (int i = 1; i < grid.length - 1; i++) {
	        for (int j = 1; j < grid[i].length - 1; j++) {
	            if (grid[i][j] == 5 && judge(i, j, grid) ) {
	                count++;
	                j++;
	                f = true;
	            }
	        }
	        if (f) {
	            i++;
	        }
	        f = false;
	    }
	    return count;
	}

	private boolean judge(int i, int j, int[][] grid) {
	    for (int k = -1; k <= 1; k++) {
	        for (int l = -1; l <= 1; l++) {
	            if (k == 0 && l == 0) {
	                continue;
	            }
	            if (grid[i + k][j + l] < 1 || grid[i + k][j + l] > 9 || grid[i + k][j + l] == 5) {
	                return false;
	            }
	        }
	    }
	    return grid[i - 1][j - 1] + grid[i + 1][j + 1] == 10 && grid[i - 1][j] + grid[i + 1][j] == 10
	            && grid[i - 1][j + 1] + grid[i + 1][j - 1] == 10 && grid[i][j - 1] + grid[i][j + 1] == 10
	            && grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] == 15
	            && grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1] == 15
	            && grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1] == 15
	            && grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1] == 15;
	}

}

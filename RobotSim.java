package com.edu.sut.tys06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RobotSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] commands = {4,-1,4,-2,4};
		int[][] obstacles = {{2,4}};
		RobotSim rs = new RobotSim();
		System.out.println(rs.robotSim(commands, obstacles)); 
	}
	
	public int robotSim(int[] commands, int[][] obstacles) {
        //-2：向左转 90 度
        //-1：向右转 90 度
        //1 <= x <= 9：向前移动 x 个单位长度
		int x = 0;
		int y = 0;
        int distance = 0;
        int turn = 0; //0(上):x不变y加 ; -1(左):x减y不变  ; 1(右):x加y不变 ; -2(下):x不变y减
        Map<Integer, Integer> mapObstacles = new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
			mapObstacles.put(obstacles[i][0], obstacles[i][1]);	
		}
        for(int command:commands){
            if (command == -2){
            	switch (turn) {
				case 0:
					turn = -1;
					break;
				case -1:
					turn = -2;
					break;
				case -2:
					turn = 1;
					break;
				case 1:
					turn = 0;
					break;
				default:
					break;
				}
            }
            if (command == -1) {
            	switch (turn) {
				case 0:
					turn = 1;
					break;
				case 1:
					turn = -2;
					break;
				case -2:
					turn = -1;
					break;
				case -1:
					turn = 0;
					break;
				default:
					break;
				}
			}
            if(1 <= command&&command <= 9){
            	int flag = 0;
            	if(turn == 0){
            		for(Integer k:mapObstacles.keySet()){
            			if(x == k){
							flag++;
							y = mapObstacles.get(k) - 1;
						}
            		}
            		/*for (Entry<Integer, Integer> entry: mapObstacles.entrySet()) {
						if(x == entry.getKey()){
							flag++;
							y = entry.getValue() - 1;
						}
					}*/
            		if(flag == 0){
                		y = y + command;
            		}
            	}
            	if(turn == 1){
            		for(Integer k:mapObstacles.keySet()){
            			if(y == mapObstacles.get(k)){
							flag++;
							x = k - 1;
						}
            		}
            		/*for (Entry<Integer, Integer> entry: mapObstacles.entrySet()) {
						if(y == entry.getValue()){
							flag++;
							x = entry.getKey() - 1;
						}
					}*/
            		if(flag == 0){
            			x = x + command;
            		}		
            	}
            	if(turn == -1){
            		for(Integer k:mapObstacles.keySet()){
            			if(y == mapObstacles.get(k)){
							flag++;
							x = k + 1;
						}
            		}
            		/*for (Entry<Integer, Integer> entry: mapObstacles.entrySet()) {
						if(y == entry.getValue()){
							flag++;
							x = entry.getKey() + 1;
						}
					}*/
            		if(flag == 0){
            			x = x - command;
            		}	
            	}
            	if(turn == -2){
            		for(Integer k:mapObstacles.keySet()){
            			if(x == k){
							flag++;
							y = mapObstacles.get(k) + 1;
						}
            		}
            		/*for (Entry<Integer, Integer> entry: mapObstacles.entrySet()) {
						if(x == entry.getKey()){
							flag++;
							y = entry.getValue() + 1;
						}
					}*/
            		if(flag == 0){
            			y = y - command;
            		}
            	}
            }
        }      
        distance = (int) (Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
	}

}

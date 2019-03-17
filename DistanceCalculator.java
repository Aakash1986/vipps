package com.java;

public class DistanceCalculator {

	 public static void main(String[] args) {


	        Distance dist1 = new DistanceImplementation();
	        Distance obj2 = new DistanceImplementation();

	        //dist1.setFeetAndInches(1, 8);
	        //obj2.setFeetAndInches(3, 5);
	        

	        dist1.setFeetAndInches(1, 3.0f);
	        obj2.setFeetAndInches(1, 2.0f);

	        System.out.println(dist1.getDistanceComparison(obj2));
		 
		

	    }
	}
	
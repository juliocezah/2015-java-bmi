package br.edu.univas.si.lab6.bmi.service;

public class BMIService {
	
	private BMIService(){
		//To avoid a new instance of BMIService class
	}
	
	public static Float getIndex(Float weight, Float height){
		return weight / (height*height);
	}
	
	public static String getDescription(Float bmiIndex){
		//TODO to be implemented as home work
		return "";
	}

}

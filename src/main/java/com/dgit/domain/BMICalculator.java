package com.dgit.domain;

public class BMICalculator {
	private double normal;//정상
	private double overWeight;//과체중지수
	private double lowWeight;//저체중지수
	private double obesity;//비만
	
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public String bmiCalculator(double weight, double height){
		double h = height * 0.01;
		double result = weight / (h * h);
		
		System.out.println("BMI 지수 : " + result);
		if(result > obesity){
			System.out.println("비만 입니다.");
			return "비만 입니다.";
		}else if(result > overWeight){
			System.out.println("과체중 입니다.");
			return "과체중 입니다.";
		}else if(result > normal){
			System.out.println("정상 입니다.");
			return "정상 입니다.";
		}else{
			System.out.println("저체중 입니다.");
			return "저체중 입니다.";
		}
	}
	
}

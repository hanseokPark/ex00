package com.dgit.domain;

public class Report {
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public double getGrade3() {
		return grade3;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	public double getGrade4() {
		return grade4;
	}
	public void setGrade4(double grade4) {
		this.grade4 = grade4;
	}
	
	public String reportGrade(double math, double eng, double kor){
		double div = 0.0;
		div = (math+eng+kor)/3;		
		
		if(grade1 <= div){
			System.out.println("grade1 입니다.");
			return "grade1 입니다.";
		}else if(grade2 <= div){
			System.out.println("grade2 입니다.");
			return "grade2 입니다.";
		}else if(grade3 <= div ){
			System.out.println("grade3 입니다.");
			return "grade3 입니다.";
		}else if(grade4 <= div ){
			System.out.println("grade4 입니다.");
			return "grade4 입니다.";
		}
		return "낙제입니다";
		
	}
}

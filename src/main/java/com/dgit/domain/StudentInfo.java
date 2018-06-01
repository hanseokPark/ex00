package com.dgit.domain;

public class StudentInfo {
	private String name;
	private int ban;
	private double math;
	private double eng;
	private double kor;
	private Report report;
	
	
	public StudentInfo(){		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	
	public String getInfo(){
		System.out.println("이름 : " + name );
		System.out.println("반 : " + ban );
		System.out.println("수학 : " + math );
		System.out.println("영어 : " + eng );
		System.out.println("국어 : " + kor );
		return report.reportGrade(math, eng, kor);		
		
		
	}
}

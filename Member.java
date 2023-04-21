package com.study.springboot.bean;

public class Member {
	
	private String name;
	private String nickname;
	private Printer printer; // 필드는 0 또는 null로 초기화됨
	
	public Member() {}		// 기본 생성자
	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	
	public void print() {
		if(this.printer != null) {
		this.printer.print("Hello " + this.name + " : "+ this.nickname);
		}
	}
		
		

}

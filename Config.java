package com.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	// import shortcut : Ctrl + Shift + O
public class Config {
	
	@Bean // 메소드를 Bean으로 등록했다... 꺼내 올 수가 있다... @Configuration이 꼭 있어야 함... 없으면 못 읽음... 
	public Member member1() {
		Member member1 = new Member();
		member1.setName("홍길동");			// setter로 지정...
		member1.setNickname("도사");
		member1.setPrinter(new PrinterA());
		return member1;
	}
	
	@Bean(name="hello")	// Bean의 이름을 변수로 지정......
	public Member member2() {
		return new Member("전우치", "도사", new PrinterA()); // new로 지정...
	}
	
	@Bean // 지정 안하면 메소드명으로 지정.........
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
	
	
}

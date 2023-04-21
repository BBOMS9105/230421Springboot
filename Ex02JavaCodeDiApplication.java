package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;
import com.study.springboot.bean.PrinterA;

//@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
		
		
	//	SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		System.out.println("Hello World");
		
		// 강한결합 고전적인 방법
		Printer printer = new PrinterA();
		Member member = new Member("이름", "별명", printer);
		member.print();
		
		// 약한결합
		// IoC(Inversion on Control)해서 DI(Dependency Injection)한다
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Member member1 = (Member) context.getBean("member1");
		member1.print();
 		
		Member member2 = context.getBean("hello", Member.class);
		member2.print();
		
		Printer printer2 = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer2);
		member1.print();
		
		
	}

}

package com.itwill1.bean.create.annotation;

import org.springframework.stereotype.Component;

@Component("createBean3")
public class CreateBean3 {
	public CreateBean3() {
		System.out.println("### CreateBean3()기본생성자");
	}
}

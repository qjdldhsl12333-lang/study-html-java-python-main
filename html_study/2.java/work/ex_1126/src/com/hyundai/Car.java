package com.hyundai;

// import 패키지 명.클래스명; -> 특정 클래스만 import
// import 패키지명.*;
import com.hankook.*;
import com.kumho.*;

public class Car {
//	Tire tire = new Tire(); 오류
	//클래스 전체 이름을 사용해서 정확히 어떤 패키지의 클래스를 
	// 사용하는지 알려줘야한다.
	com.hankook.Tire tire = new com.hankook.Tire();
	com.kumho.Tire tire2 = new com.kumho.Tire();
	
	SnowTire st = new SnowTire();
}

package ch16;

public class Earth {
	//상수의 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	// 상수의 선언
	static final double EARTH_SURFACE_AREA;
	
	static { // static 과 관련된 것들을 초기화 해줄수있는 블록
		EARTH_SURFACE_AREA =4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

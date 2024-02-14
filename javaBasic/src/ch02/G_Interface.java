package ch02;

// 인터페이스: 클래스가 구현해야만하는 메서드들을 선언하는 참조 타입
// 인터페이스의 모든 변수는 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함 (default나 static 메서드가 올 수도 있음)
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 {...}

// 넓이 공식 (알잘딱으로 알아들어)
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 삼각형 넓이
// 정사각형 넓이 구하기 - Double 변 -> Double 정사각형의 넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 직사각형 넓이
// 원 넓이 구하기 - Double 반지름 (Double 원주율 < 얘는 절대 변하지 않는 상수니까 생략) -> Double 원의 넓이

interface AreaCalculation {
	
	public static final double PI = 3.14; // <= 파이를 소수점 아래 2자리까지만 쓰기로 약속~
	
	public abstract double getTriangleArea (double bottom, double height);
	public abstract double getSquareArea (double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
	
}

// 인터페이스는 implements 키워드를 이용해서 클래스에 구현해야함
class MyMath implements AreaCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
	
}

class MyMathV2 implements AreaCalculation {
	
	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return Math.pow(side, 2);
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
	
}

public class G_Interface {

	public static void main(String[] args) {
		
		AreaCalculation instance = new MyMathV2();
		
	}

}

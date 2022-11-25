package ch02_1017;

public class TypeEx1 {
	public static void main(String[] args) {

		byte b1 = 3; // 초기화 : 최초에 값을 할당, 대입한다.
		int i1 = 200;
		byte b2 = (byte) i1; // ( ) 소괄호의 의미는 캐스팅 연산자라고 함.
		// 강제로 해당 소괄호 안에 형으로 명시적, 강제적 형변환.
		// 운좋게 해당 값이 담을 수 있다면, 정상 출력 되겠지만, 담을 수 있는 범위를 넘어가는데도 강제로 형변환을 하면 의미없는 값이 나온다. >
		// 값 손실이 발생.
		System.out.println(" b2 출력-강제로 형변환-값의 범위초과 : " + b2);

		int i = 10;
		var j = 10.0;
		var str = "hello";

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

//		str = "test";

//		str = 3; //오류 남  
	}

}

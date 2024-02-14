package ch02_sub; // G_Message, G_Method 파일 같이 봐야함

class InterfaceSub implements G_Message {
	
	int method3 (int number) {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBEY_MESSAGE);
		return 3 + number;
	}
	
}

public class G_InterfaceSub implements G_Message, G_Method { //<= 다중구현

	public void method1 () { // G_Method 파일에서 public 으로 정의 해서 public 써야됨
		System.out.println(GREETING_MESSAGE); //<=이고 쓸려면 implements G_Message 쓰고
		
		System.out.println(GOODBEY_MESSAGE);
	}
		
	public void method2 () {
		System.out.println(G_Message.GREETING_MESSAGE); // 이거는 implements G_Message 없어도 됨
		
		System.out.println(G_Message.GOODBEY_MESSAGE);
	}

}

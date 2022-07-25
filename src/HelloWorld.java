import java.lang.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("*****************");		
//		System.out.println("Hello, World");		
//		System.out.println("*****************");		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은? : ");
		String name = sc.nextLine(); //오른쪽에서 읽은 값을 name에 저장 (=)
		
		System.out.println("귀하의 이름은 " + name + "이군요.");
	}
}

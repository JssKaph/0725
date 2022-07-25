import java.util.*;

public class Userinfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("귀하의 이름은? : ");
		String name = sc.nextLine();
		
		System.out.print("귀하의 나이는? : ");
		int age = sc.nextInt();
		
		sc.nextLine(); //엔터가 중복으로 들어와 밑에 전화번호의 프린트가 스킵됨 따라서 공백을 집어넣음
		
		System.out.print("귀하의 신장은? : ");
		double height = sc.nextDouble();
		
		System.out.println("이름 :" + name + ", 나이 : " + age + ", 키 : " + height);
	}
}

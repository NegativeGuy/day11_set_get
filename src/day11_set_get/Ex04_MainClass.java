package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력"); name = sc.next();
		System.out.println("나이 입력"); age = sc.nextInt();

		// 객체 생성 후 setter를 통해 각각의 값을 저장
		Ex04_set_get ex = new Ex04_set_get();
		ex.setName(name);
		ex.setAge(age);
		// 나이를 만으로 계산하는 메소드 생성 후 age에 저장
		// 저장된 값을 getter를 통해 main에서 출력
		// ??님의 나이는 ??세 입니다
		System.out.println(ex.getName()+"님의 나이는 "+ex.getAge()+"세 입니다");
	}
}

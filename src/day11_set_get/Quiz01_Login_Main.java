package day11_set_get;

import java.util.Scanner;

public class Quiz01_Login_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz01_Login ex = new Quiz01_Login();
		String id;
		int pw;
		
		while(true) {			
			System.out.println("1.로그인  2.가입  3.로그아웃");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				System.out.print("ID 입력 : ");
				id = sc.next();
				System.out.print("PW 입력 : ");
				pw = sc.nextInt();
				int result = ex.op(id, pw);
				if(result == 0) {
					System.out.println("인증 실패"); break;
				}
				else if(result == 1){
					System.out.println("인증 성공"); break;
				}
				
			case 2:
				System.out.print("가입 ID 입력 : ");
				id = sc.next();
				ex.setId(id);
				System.out.print("가입 PW 입력 : ");
				pw = sc.nextInt();
				ex.setPw(pw);
				System.out.println("저장 완료"); break;
				
			case 3:
				System.out.println("로그아웃 완료");
				System.exit(0);
			}
		}
	}
}

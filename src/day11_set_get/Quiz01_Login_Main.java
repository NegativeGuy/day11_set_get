package day11_set_get;

import java.util.Scanner;

public class Quiz01_Login_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz01_Login ex = new Quiz01_Login();
		String id;
		int pw;
		
		while(true) {			
			System.out.println("1.�α���  2.����  3.�α׾ƿ�");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				System.out.print("ID �Է� : ");
				id = sc.next();
				System.out.print("PW �Է� : ");
				pw = sc.nextInt();
				int result = ex.op(id, pw);
				if(result == 0) {
					System.out.println("���� ����"); break;
				}
				else if(result == 1){
					System.out.println("���� ����"); break;
				}
				
			case 2:
				System.out.print("���� ID �Է� : ");
				id = sc.next();
				ex.setId(id);
				System.out.print("���� PW �Է� : ");
				pw = sc.nextInt();
				ex.setPw(pw);
				System.out.println("���� �Ϸ�"); break;
				
			case 3:
				System.out.println("�α׾ƿ� �Ϸ�");
				System.exit(0);
			}
		}
	}
}

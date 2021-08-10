package day11_set_get;

public class Quiz01_Login {
	private String id;
	private int pw;
	
	public void setId(String id) {
		this.id = id;
		System.out.println(this.id);	// 확인
	}
	public void setPw(int pw) {
		this.pw = pw;
		System.out.println(this.pw);	// 확인
	}
	public int op(String id, int pw) {
		System.out.println("this : "+this.id+"/"+this.pw);
		System.out.println(id+"/"+pw);
		if(this.id.equals(id)&& this.pw == pw) {
			return 1;
		}
		else{
			return 0;
		}
	}
}

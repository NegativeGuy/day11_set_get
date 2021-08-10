package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		//객체 생성 후 각각의 값(kor, eng, math, sum, avg)을 저장
		Ex05_set_get ex = new Ex05_set_get();
		//출력(국,영,수,합,평균)
		ex.setKor(k);
		ex.setEng(e);
		ex.setMath(m);
		ex.setSum(k+e+m);
		ex.setAvg(ex.getSum()/3.0);
		System.out.println("국어 : "+ex.getKor());
		System.out.println("영어 : "+ex.getEng());
		System.out.println("수학 : "+ex.getMath());
		System.out.println("총점 : "+ex.getSum());
		System.out.println("평균 : "+ex.getAvg());
	}
}

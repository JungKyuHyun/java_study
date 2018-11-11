package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		String job = "fa";
		String jobDesc;
		
		switch (job) {
		case "fa" : jobDesc = "아빠 입니다";
				break; // break가 없다면 조건은 만족했더라도 switch문의 나오지 않고 계속 수행
		case "ma" : jobDesc = "엄마 입니다";
				break;
		case "son" : jobDesc = "자식 입니다.";
				break;
		default:
			jobDesc = "관계 없습니다.";
		}
		System.out.println("내 직업은 " + job + "이고 정확히는 " + jobDesc + " 입니다.");
	}
}

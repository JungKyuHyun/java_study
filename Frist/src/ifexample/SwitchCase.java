package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		String job = "fa";
		String jobDesc;
		
		switch (job) {
		case "fa" : jobDesc = "�ƺ� �Դϴ�";
				break; // break�� ���ٸ� ������ �����ߴ��� switch���� ������ �ʰ� ��� ����
		case "ma" : jobDesc = "���� �Դϴ�";
				break;
		case "son" : jobDesc = "�ڽ� �Դϴ�.";
				break;
		default:
			jobDesc = "���� �����ϴ�.";
		}
		System.out.println("�� ������ " + job + "�̰� ��Ȯ���� " + jobDesc + " �Դϴ�.");
	}
}

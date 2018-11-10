package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 1
		int iNum4 = (int)(dNum1 + fNum2); // 2
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int iNum5 = 10;
		float fNum6 = 2.0f;
		
		System.out.println(iNum5+(int)fNum6);
		System.out.println(iNum5-(int)fNum6);
		System.out.println(iNum5*(int)fNum6);
		System.out.println(iNum5/(int)fNum6);
		
		char ch1 = '��';
		System.out.println((int)ch1);
		
	}

}

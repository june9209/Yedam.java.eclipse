package com.yedam.java.ch0401;

public class Quiz0 {

	public static void main(String[] args) {

		// ����1) �Ʒ��� ���� �� ������ �ʱ�ȭ�Ͽ��� �� �� ������ �°� �����ϼ���.
		int x = -5;
		int y = 10;
		int result;

		// 1-1) ��ȣ�����ڸ� �̿��Ͽ� ���� x�� ���� ����� ����ϼ���. ��, ���� x�� ���� ������ ���ƾ��Ѵ�.
		x = -x;
		System.out.println("���� 1-1 : " + x);
		x = -5;

		// 1-2) ���� x�� ���� ������Ų �� ���� y�� ���� ���� ���� ���� y�� ���� ���ҽ�Ű�� ������� ���ٷ� �ۼ��ϼ���.
		result = ++x + y--;
		System.out.println("���� 1-2 : " + result);

		// 1-3) ���� x�� y�� ���� ���� ���� 5�� �ǵ��� ���������ڸ� ����Ͽ� ������� ���ٷ� �ۼ��ϼ���.
		result = ++x + --y;
		System.out.println("���� 1-3 : " + result);

		// ����2) �Ʒ��� ���� �� ������ �ʱ�ȭ�Ͽ��� �� ���� ����� ���ʴ�� false �� true�� ����ϵ��� �����ϼ���.
		int m = 10;
		int n = 5;
		
		System.out.println("���� 2 : "+!((m*2 == n*4) || (n <= 5)));
		System.out.println("	"+!((m/2 > 5) && (n%2 <1)));
		
		// ����3) �� ������� ���� ������ �ϳ��� ������ ��������� �����ϼ���.
		int val = 0;
		val += 10;
		System.out.println("���� 3 : " + val);
		val -= 5;
		System.out.println("	"+val);
		val *= 3;
		System.out.println("	"+val);
		val /= 5;
		System.out.println("	"+val);
		
		//����4) ���� val�� ���� ����� ��쿣 ���� ����, �ƴ� ��쿣 0�� ��� ������ �����ϼ���. (��, ���׿����ڸ� ���)
		int num = (val >= 0) ? val : 0; 
		System.out.println("���� 4 : " +num);
		
		/* ���� 5) ������ ���� �� ���� ������ �־����� ��� 
		    �� ���� �߿��� ������ �ִٸ� 'One of a or b is negative number'��,
		    ���� �׷��� �ʴٸ� 'both a and b are zero or more'�� ����ϵ��� �����ϼ���. */
		int a = 10;
		int b = -8;
		String result1 = ((a <= 0)||(b <= 0)) ? "One of a or b is negative number" : "both a and b are zero or more" ;
		System.out.println("���� 5 : " + result1);
	}

}

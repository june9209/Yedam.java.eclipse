package com.yedam.java.ch0302;

import java.util.Scanner;

public class Homework_0 {

	public static void main(String[] args) {
		// �־��� �迭�� �̿��Ͽ� ���� ������ �����ϼ���.
		System.out.print("����1 . ");
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc = new Scanner(System.in);
		// ����1. �־��� �迭 �߿��� ���� 60�� ���� �ε����� ����غ���.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60)
				System.out.println(arr1[i]);
		}

		// ����2. �־��� �迭�� �ε����� 3�� ���� ������� ����, �������� ����غ���.
		System.out.print("����2 . ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 3) {
				System.out.print(arr1[i] + " ");
			}
		}

		// ����3. �־��� �迭 ���� �����ϰ� ���� ���� �ε��� ��ȣ�� �Է¹޾�, �� ���� 1000���� �����غ���.
		// �Է�) �ε���: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		System.out.print("\n����3 . ");
		int num3_1 = sc.nextInt();
		for (int i = 0; i < arr1.length; i++) {
			arr1[num3_1] = 1000;
			System.out.print(arr1[i] + " ");
		}
		arr1 = new int[] { 10, 20, 30, 50, 3, 60, -3 };
		// ����4. �־��� �迭�� ��ҿ��� �ִ밪�� �ּҰ��� ���غ���.
		System.out.print("\n����4 . \n");

		int arr1Max = arr1[0];
		int arr1Min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr1Max) {
				arr1Max = arr1[i];
			} else if (arr1[i] < arr1Min) {
				arr1Min = arr1[i];
			}
		}
		System.out.println("�ִ밪 : " + arr1Max);
		System.out.println("�ּҰ� : " + arr1Min);

		// ����5. ������ �迭�� �����Ͽ� ���� ����10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		System.out.print("����5 . ");
		System.out.println("���� ���� 10�� �Է�>");

		int[] Num = new int[10];
		for (int i = 0; i < 10; i++) {
			Num[i] = sc.nextInt();

		}
		for (int i = 0; i < Num.length; i++) {
			if (Num[i] % 3 == 0)
				System.out.print(Num[i] + " ");
			;
		}
		System.out.println("\n\n\n");

		// �߰�����)
		// ����1) ������ Ű����κ��� �л����� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�.
		// �������� ����, �˸°� �ۼ��غ�����.
		// ������ó, �̰��� �ڹٴ� 183������ 9��

		boolean run = true;
		while (run) {
			System.out.println("------------------�߰�����-----------------------");
			System.out.println("1.�л� �� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("�޴� > ");
			int menu = sc.nextInt();
			// ����
			int i = 0;
			int per = 0;
			int score = 0;
			int[] per_array = new int[per];
			// �޴� �ݺ�����
			switch (menu) {
			// �л� ��
			case 1:
				System.out.print("�л� ���� �Է� �Ͻÿ�.");
				per = sc.nextInt();
				per_array = new int[per];
				break;
			// ���� �Է�
			case 2:
				System.out.print("������ �Է� �Ͻÿ�.");
				for (i = 0; i < per_array.length; i++) {
					System.out.printf("per_array[%d]>%s \n" , i, per_array);
					score = sc.nextInt();
					per_array[i] = score;
				}
				break;
			case 3:
				for (int j = 0; j < per_array.length; j++) {
					System.out.println(per_array[i]);
				}
				break;
			
			
			}

		}
	}
}

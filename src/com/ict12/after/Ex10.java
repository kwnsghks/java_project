package com.ict12.after;

public class Ex10 {

	public static void main(String[] args) {
		// while�� : for���� ���� �ݺ���
		// ���� 1) 
		//        �ʱ��;
		//        while(���ǽ�){
		//             ���ǽ��� ���� �� ������ ����;
		//        ������;
		//        }
		//   **   while�� ���� ������ ���ǽ����� ����
		
		// 1~10���� �������
		int i = 1;
		while(i<11) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n");
		// 1~10���� ¦���� ��� ��
		int j = 1;
		while(j<11) {
			if(j%2==0) {
			System.out.println(j+" ");
			}
			j++;
		}
		// ����2)
		// �ʱ��
		// while(true){
		//  ** if (�������� ���ǽ�) break;(���� Ż��)
		//  ������ ����;
		//  ** if (�������� ���ǽ�) break; (���� Ż��)
		//  ������;
		// }
		
		// 1~10���� ������� (���� Ż��)
		int s1 =1 ;
		while (true) {
			if (s1>=11) break;
			System.out.println(s1);
			s1++;
		}
		System.out.println();
		
		// ����Ż��
		int s2 =1 ;
		while (true) {
			System.out.println(s2);
			if (s2>=10) break;
			s2++;
		}
		System.out.println();
		
		// 1~10���� ¦���� ���
		int s3 = 1;
		while (true) {
			if(s3>=11) break;
			if(s3%2==0) {
			System.out.println(s3);
			}
			s3++;
		}
	}
}

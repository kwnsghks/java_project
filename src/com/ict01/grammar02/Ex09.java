package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
	// 2�ð� 40�� 23�ʸ� �ʴ����� �����ض�
        int h = 2 ;
        int m = 40 ;
        int s = 23 ;
        
        // �ð��� ��,  ���� ��,          
        int s1 = h * 60 * 60 ;
        int s2 = m * 60 ;
        
        int total = s1 + s2 + s ;
        System.out.println("2�ð� 40�� 23�ʴ� " + total + "�� �Դϴ�."); 

        // 9630�ʴ� ��ð� ��� �����ΰ�?
        int time = 9630 ;
        int h1 = 0 ; // �ð�
        int m1 = 0 ; // ��
        int s3 = 0 ; // ��
        int res = 0 ; // ������

        // �ð� ���ϱ� 
        h1 = time / (60*60);
        res = time % (60*60);

        // �ð��� ���� �� �������� ������ �� ���ϱ� 
        m1 = res / 60 ;

        // ���� ���� �� �������� ���̴�.
        s3 = res % 60 ;
        
        System.out.println(time + "�ʴ�" + h1 +":" + m1 +":"+ s3);
	}
}





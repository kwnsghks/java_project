package com.ict01.grammar03;
class Ex04{
	public static void main(String[] args){
	// ���׿����� (���ǿ����� = ���ǹ��� if ~ else ���� ����)
        // - ���� : ���庯�� = ���ǽ� ? ���϶� ������ ���� : �����϶� ������ ���� ;  
        //          ���ǽĿ��� boolean, ������, �񱳿����� ����.
        // - ���ǻ��� : ���庯��, ���϶� ������, �����϶� ������ 
        //              ��� ���� �ڷ����̾�� �Ѵ�.
        //              ( ���庯���� �� ū�ڷ����̸� ���� ����.)
        //  byte < short < char < int < long < float < double ;
        
        int result = true ? 14 : 10 ;
        System.out.println("��� : " + result);  // 14            
	
	result = false ? 14 : 10 ;
        System.out.println("��� : " + result); // 10

	int result2 = false ? 14 : 'C' ;
        System.out.println("��� : " + result2); // C�� �ش��ϴ� ����
        System.out.println("��� : " + (char)(result2)); // C�� ǥ�� �ҷ���

        // �־��� sum�� 80�̻��̸� "�հ�", �ƴϸ� "���հ�";
        int sum = 81 ;
        String result3 = (sum >= 80) ? "�հ�" : "���հ�" ;
        System.out.println("��� : " + result3); 
	
        // ��������� 90�̻��̸� A, �ƴϸ� B ;
	double avg = 87.0 ;
        double result4 = (avg >= 90) ? 'A' : 'B' ;
        System.out.println("��� : " + result4); 
	System.out.println("��� : " + (char)(result4)); 
	}
}



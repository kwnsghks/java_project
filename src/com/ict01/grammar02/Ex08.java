package com.ict01.grammar02;
class Ex08{
	public static void main(String[] args){
	// �Ƹ޸�ī�밡 2500���̴�. ģ���� ���̼� 10000�� ���� �ֹ��ߴ�.
        // �ܵ��� ���ΰ�? ( �ΰ��� 10%�� �߰��ȴ�.)
        
	//  �Է�����
         String coff = "�Ƹ޸�ī��" ;
         int dan = 2500 ;
         int su = 2 ;
         int input  = 10000 ;

        int total = dan * su ;
        int vat = (int)(total * 0.1); 
        int output = input - (total + vat) ;
         
        int total2 = (int)((dan *su) * 1.1) ;
        int output2 = input - (total2) ;

        System.out.println("�ܵ� : " +  output);  
        System.out.println("�ܵ� : " +  output2);  
     

	}
}
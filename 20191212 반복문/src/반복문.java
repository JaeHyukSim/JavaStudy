/*
 * do-while
 * 
 * �ʱⰪ
 * do{
 * 	���๮�� ==> ���� ������ ����� �� �ִ�
 * 	������ ==> ������
 * 		i++ , i--, i+=2, i-=2;
 * }while(condition);
 */

public class �ݺ��� {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 10);
		
		System.out.println();
		do {
			i--;
			System.out.print(i + " ");
		}while(i>1);
	}

}

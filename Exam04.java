
public class Exam04 {

	public static void main(String[] args) {
		// �������� �ڷ���
		/*
		 * �ڹٿ��� �ڷ����� ũ�� �ΰ����� ������. 
		 *   1.�⺻��  1) ������ (byte, short, int, long)
		 *           byte - 1byte  byte= -128~127
		 *           short - 2byte 
		 *           int - 4byte
		 *           iong - 8byte
		 *           2) �Ǽ��� (float, double)
		 *           float - 4byte
		 *           double - 8byte
		 *           3) ���� (boolean)
		 *           boolean - 1byte
		 *           4) ������ (char)
		 *           char - 2byte
		 *   2.���۷��� �ڷ���        
		 * 
		 * */
		byte num1 = 126;
		short num2 = 5000;
		int num3 = 2000000; 
		long num4 = 22222222;
		float num5 = 10.4f;
		// �ڹٿ��� �Ǽ����� �⺻������ double�� �ν��Ѵ�. float ǥ���ϰ������� -> 1.���� �ڿ� fǥ�� 2. (float)����ǥ��
		double num6 = 222.12345;
		boolean isCheck = true;
		isCheck= false;
		char text = 'A';
		text = '��';
		
		char test = 'A';
		int num10 = test;
		System.out.println(num10);
		String text2 = "ABC";
		text2 = "������"; 
		/*
		 * ī�� ǥ��� : ù�ܾ� �ҹ��� ���� ���� �빮��
		 * �Ľ�Į ǥ��� : �� �ܾ� �빮��
		 * ������ũ ǥ���  : �ܾ� ���̸��� ����� ����
		 * �밡���� ǥ��� : ���ξ �ڷ��� ����
		 * */
		
	}

}

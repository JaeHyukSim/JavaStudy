
public class MainClass {

	public static void main(String[] args) {
		//Ŭ���� ����
		Sawon s1 =  new Sawon();
		//Ȱ��
		s1.setSabun(1);
		s1.setName("����");
		s1.setDept("��ǻ�ͺ�");
		s1.setLoc("����");
		s1.setPay(3500);
		
		//���
		System.out.println(s1.getSabun() + " " + s1.getName() + " " + s1.getDept()+ " " +s1.getLoc()+ " " +s1.getPay());
		
		//Ŭ���� ����
				s1 =  new Sawon();
				//Ȱ��
				s1.setSabun(2);
				s1.setName("����");
				s1.setDept("���ߺ�");
				s1.setLoc("��õ");
				s1.setPay(6500);
				
				//���
				System.out.println(s1.getSabun() + " " + s1.getName() + " " + s1.getDept()+ " " +s1.getLoc()+ " " +s1.getPay());
	}

}

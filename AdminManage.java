import java.util.Scanner;

public class AdminManage {
	/**
	 * ������۹���ϵͳ--���߰���Ĺ���
	 * 
	 * @version 2018��2��1�� 10:48:47
	 * @author ���
	 */

	// ��¼
	static void login(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner login = new Scanner(System.in);
		for (int i = 2; i >= 0; i--) { // �����������
			System.out.println("\t\t������۹���ϵͳ");
			System.out
					.println("*************************************************");
			System.out.println("�������ʺ�(admin)��");
			String account = login.next();
			System.out.println("����������(123)");
			int password = login.nextInt();
			if (account.equals("1") && password == 1) { // �ʺ�Ϊadmin ����Ϊ123
				firstMenu(userId, userAge, userPoints, bookName, bookPrice); // ��¼�ɹ��������˵�
			} else if (i == 0) {
				System.out.println("�������������������ϵͳ�����˳���");
				System.exit(0);
			}
			System.out.println("������������ԣ�������" + i + "�λ��ᣡ");
		}
	}

	// ���˵�
	public static void firstMenu(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner main = new Scanner(System.in);
		Menu.menu2();
		int num = main.nextInt();
		while (true) {
			switch (num) {
			case 1:
				UserManage.userManage(userId, userAge, userPoints, bookName,
						bookPrice);// �û�����
			case 2:
				BookManage.bookManage(userId, userAge, userPoints, bookName,
						bookPrice);// �鼮����
			case 3:
				Pay.pay(userId, userAge, userPoints, bookName, bookPrice);// �������
			case 4:
				GiftManage.giftManage(userId, userAge, userPoints, bookName,
						bookPrice);// ���ֶһ�����
			case 5:
				exit();
			default:
				inputNumError();
			}
		}

	}

	// �˳�/ע��
	static void exit() {
		System.out.println("���˳�");
		System.exit(0); // �˳�ϵͳ
	}

	// �����������
	static int inputNumError() {
		Scanner input = new Scanner(System.in);
		System.out.println("�������������:");
		int rnum = input.nextInt();
		return rnum;
	}

}

import java.util.Scanner;

public class GiftManage {
	/**
	 * ������۹���ϵͳ--���鶼������
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */

	public static void giftManage(int userId[], int userAge[],
			int userPoints[], String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu5();
		int UserId = 0;// Ѱ�һ�ԱID����Ӧ��������,ע��������userId���ֿ�
		boolean userIdPanDuan = false;
		do {

			int inputUserId = input.nextInt();
			for (UserId = 0; userId[UserId] != 0; UserId++) {
				if (inputUserId != userId[UserId]) {
					continue;
				}
					userIdPanDuan = true;
					break;
				
			}
			if (userIdPanDuan = true) {
				break;
			}
			System.out.print("����Ļ�ԱID�������������룺");
		} while (true);
		String giftName = null;
		int giftPoints = 0;
		System.out.println("������������:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			giftName = "����";
			giftPoints = 10;

			break;

		case 2:
			giftName = "usbС̨��";
			giftPoints = 100;
			break;

		case 3:
			giftName = "usbС����";
			giftPoints = 200;
			break;

		case 4:
			giftName = "�˶�����";
			giftPoints = 1000;
			break;
		// default:
		// System.out.println("û�д˱�ŵ���Ʒ��������!");
		// num = input.nextInt();
		}
		if (giftPoints == 0) {
			System.out.println("�Բ���������ı��û�ж�Ӧ����Ʒ��");
		} else if (giftPoints > userPoints[UserId]) {
			System.out.println("��Ļ��ֲ��������ܶһ�" + giftName);
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		} else {
			userPoints[UserId] = (userPoints[UserId] - giftPoints);
			System.out.println("��ɹ��һ���һ��" + giftName + ",�㻹��"
					+ userPoints[UserId] + "����");
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

	// �밴'u'����������˵�
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("�밴'u'�������˵�:");
		String u = input.next();
		if (u.equals("u")) {
			AdminManage.firstMenu(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {
			pressUBack(userId, userAge, userPoints, bookName, bookPrice);

		}
	}
}

import java.util.Scanner;

public class UserManage {
	/**
	 * ������۹���ϵͳ
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	
	// ���˵�
	static void userManage(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu3();
		String function = input.next();
		while (true) {
			if (function.equals("1")) {
				showAllUserInfo(userId, userAge, userPoints, bookName,
						bookPrice);// ��ʾ�����û���Ϣ
			} else if (function.equals("2")) {
				addUserInfo(userId, userAge, userPoints, bookName, bookPrice);
			} else if (function.equals("3")) {
				changeUserInfo(userId, userAge, userPoints, bookName, bookPrice);
			} else if (function.equals("m")) {
				AdminManage.firstMenu(userId, userAge, userPoints, bookName,
						bookPrice);
			} else {
				System.out.println("������������ԣ�");
				function = input.next();
			}

		}

	}

	// ��ʾ���л�Ա��Ϣ
	static void showAllUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		System.out.println("����������ϵͳ > ��Ա��Ϣ���� > ��ʾ��Ա��Ϣ\n");
		System.out.println("\t\t��Ա��\t����\t����");
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == 0) {// ��Ϊint����Ĭ��ֵΪ0�����Ե�����ֵΪ0ʱ�ͽ�����ӡ
				break;
			} else {
				System.out.println("\t\t" + userId[i] + "\t" + userAge[i]
						+ "\t" + userPoints[i]);
			}
		}
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// ��ӻ�Ա
	static void addUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ϵͳ > ��Ա��Ϣ���� > ������Ա��Ϣ");
		System.out.print("�������Ա�˺ţ�");
		int id = input.nextInt();
		System.out.print("�������Ա���䣺");
		int age = input.nextInt();
		System.out.print("�������Ա���֣�");
		int points = input.nextInt();
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == 0) {// ��Ϊint����Ĭ��ֵΪ0����������ֵΪ0ʱ�ʹ���userId[i]�����ݣ���ʱ�Ϳ���д��id
				userId[i] = id;
				userAge[i] = age;
				userPoints[i] = points;
				break;
			}

		}
		System.out.println("��ӳɹ�");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// �޸Ļ�Ա��Ϣ
	static void changeUserInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ϵͳ > ��Ա��Ϣ���� > �޸Ļ�Ա��Ϣ");
		System.out.print("�������Ա�ţ�");
		int inputUserId = input.nextInt();
		for (int i = 0; i < userId.length; i++) {
			if (userId[i] == inputUserId) {
				System.out.println(userId[i] + "�Ż�Ա��������:" + userAge[i] + "������:"
						+ userPoints[i]);
				System.out.println("�������µĻ�Ա���䣺");
				int newUserAge = input.nextInt();
				System.out.println("�������µĻ�Ա���֣�");
				int newUserPoints = input.nextInt();
				userAge[i] = newUserAge;
				userPoints[i] = newUserPoints;
				System.out.println("�޸ĳɹ���");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}

		}
		System.out.println("û���ҵ��û�ԱID!");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// �밴'u'�����û�����˵�
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("�밴'u'�����û�����˵�:");
		String u = input.next();
		if (u.equals("u")) {
			UserManage.userManage(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {

			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

}

import java.util.Scanner;

public class Pay {
	/**
	 * ������۹���ϵͳ--���鶼������
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	public static void pay(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		int buySum = 0;// �����ܽ��
		System.out.println("������۹���ϵͳ>�������");
		System.out.println("*********************�鼮�б�***********************");

		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {
				break;
			} else {
				System.out.println((i + 1) + "\t" + "����" + bookName[i] + "\t"
						+ "�۸�" + bookPrice[i]);
			}
		}
		System.out
				.println("***************************************************");
		System.out.println("�������Ա�ţ�");
		int UserId = 0;// Ѱ�һ�ԱID����Ӧ��������,ע��������userId���ֿ�
		boolean userIdPanDuan = false;
		int inputUserId = input.nextInt();
		do {

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
			System.out.println("����Ļ�ԱID�������������룺");

		} while (true);
		// boolean xunhuan=true;
		while (true) {
			System.out.println("�������鼮���:");
			int inputBookId = input.nextInt();
			int bookMaxId = 0;
			for (int i = 0; i < bookName.length; i++) {
				if (bookName[i] == null) {
					bookMaxId = i;
					break;
				}
			}
			if (inputBookId > bookMaxId) {
				System.out.println("û�д��飡��������");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}

			System.out.println("������Ҫ�������:");
			int buyNum = input.nextInt();
			System.out.println(bookName[inputBookId - 1] + "\t��"
					+ bookPrice[inputBookId - 1] + "\t��"
					+ (buyNum * bookPrice[inputBookId - 1]));
			buySum += (buyNum * bookPrice[inputBookId - 1]);

			System.out.println("�Ƿ��������y/n��?");
			String yn = input.next();
			if (!yn.equals("y")) {
				System.out.print("����ܼƣ�\t��" + buySum + "\n");
				System.out.print("���ѽ�\t��");
				int getMoney = input.nextInt();
				System.out.print("���㣺\t��" + (getMoney - buySum) + "\n");
				int points = (int) (buySum / 10);
				userPoints[UserId] = userPoints[UserId] + points;
				System.out.println("���ѻ��֣�\t��" + points);
				System.out.println("����ɹ�!");
				pressUBack(userId, userAge, userPoints, bookName, bookPrice);
			}
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

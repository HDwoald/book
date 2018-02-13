import java.util.Scanner;

public class BookManage {
	/**
	 * ������۹���ϵͳ
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */
	//���˵�
	static void bookManage(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		Menu.menu4();
		String function = input.next();
		while (true) {
			if (function.equals("1")) {
				showAllBookInfo(userId, userAge, userPoints, bookName,
						bookPrice);// ��ʾ�����鼮
			} else if (function.equals("2")) {
				addBookInfo(userId, userAge, userPoints, bookName, bookPrice);// �����鼮
			} else if (function.equals("3")) {
				delBookInfo(userId, userAge, userPoints, bookName, bookPrice);// ɾ���鼮��Ϣ
			} else if (function.equals("m")) {
				AdminManage.firstMenu(userId, userAge, userPoints, bookName,
						bookPrice);
			} else {
				System.out.println("������������ԣ�");
				function = input.next();
			}

		}

	}

	// ��ʾ�����鼮��Ϣ
	static void showAllBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		System.out.println("����������ϵͳ > �鼮���� > �鼮�б�\n");
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {
				break;
			} else {
				System.out.println("��ţ�" + (i + 1) + "\t" + "����" + bookName[i]
						+ "\t" + "�۸�" + bookPrice[i]);
			}
		}
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);
	}

	// ����鼮
	static void addBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ϵͳ > �鼮���� > ����鼮");
		System.out.print("������Ҫ��ӵ�������ƣ�");
		String newBookName = input.next();
		System.out.print("������۸�");
		double newBookPrice = input.nextDouble();
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i] == null) {// ��ΪString����Ĭ��ֵΪnull����������ֵΪnullʱ�ʹ���bookName[i]�����ݣ���ʱ�Ϳ����ڿ�λд���鼮����
				bookName[i] = newBookName;
				bookPrice[i] = newBookPrice;
				break;
			}

		}
		System.out.println("��ӳɹ�");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// ɾ���鼮
	static void delBookInfo(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ϵͳ > �鼮���� > �鼮�¼�");
		System.out.print("������Ҫɾ�������������");
		String inputBookName = input.next();
		boolean find = false;
		for (int i = 0; i < bookName.length; i++) {
			if (bookName[i].equals(inputBookName)) {
				System.out.println("�ҵ��鼮�����Ϊ��" + (i + 1));
				find = true;
			}
			if (find) {
				bookName[i] = bookName[i + 1];
				bookPrice[i] = bookPrice[i + 1];
				if (bookPrice[i] == 0.0) {
					System.out.println("�鼮��ɾ����");
					pressUBack(userId, userAge, userPoints, bookName, bookPrice);
				}
			}
		}
		System.out.println("û���ҵ����鼮");
		pressUBack(userId, userAge, userPoints, bookName, bookPrice);

	}

	// �밴'u'�����鼮����˵�
	static void pressUBack(int userId[], int userAge[], int userPoints[],
			String bookName[], double bookPrice[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("�밴'u'�����鼮����˵�:");
		String u = input.next();
		if (u.equals("u")) {
			BookManage.bookManage(userId, userAge, userPoints, bookName,
					bookPrice);
		} else {

			pressUBack(userId, userAge, userPoints, bookName, bookPrice);
		}
	}

}

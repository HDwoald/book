import java.util.Scanner;

public class StartSMS {
	/**
	 * ������۹���ϵͳ--���鶼������
	 * 
	 * @version 0.1
	 * @author zhuheng
	 */

	// ��������
	public static void main(String[] args) {
		Scanner main = new Scanner(System.in);
		int userId[] = Data.UserId();// �û�Id
		int userAge[] = Data.UserAge();// �û�����
		int userPoints[] = Data.UserPoints();// �û�����
		String booksName[] = Data.BookName();// �鼮����
		double booksPrice[] = Data.BookPrice();// �鼮�۸�
		// String giftName[]=Data.GiftName();//��������
		// int giftPoints[]=Data.GiftPoints();//����һ�����
		Menu.menu1();
		int num = main.nextInt();
		while (true) {
			if (num == 1) {
				AdminManage.login(userId, userAge, userPoints, booksName,
						booksPrice);
			} else if (num == 2) {
				AdminManage.exit();
			} else {
				System.out.println("�������������:");
				num = main.nextInt();
			}
		}
	}
}
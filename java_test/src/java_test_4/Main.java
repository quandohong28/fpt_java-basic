//Viết chương trình giải phương trình bậc 2: ax2 + bx + c = 0.

package java_test_4;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Giai phuong trinh bac hai ax2 + bx + c = 0!");
		System.out.println("Nhap vao cac tham so a, b, c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo nghiem ");
			}

			else {
				System.out.println("Phuong trinh co 1 nghiem x = " + (-c / b));
			}
		}

		else {
			float delta = b * b - 4 * a * c;
			if (delta > 0) {
				float x1 = (float) (-b + Math.sqrt(delta) / 2 * a);
				float x2 = (float) (-b - Math.sqrt(delta) / 2 * a);
				System.out.println("Phuong trinh co hai nghiem x1 = " + x1 + ", x2 = " + x2);
			}

			else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / 2 * a));
			}

			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
	}

}

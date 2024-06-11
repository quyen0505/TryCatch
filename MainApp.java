package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Phần (a): Nhập vào hai số nguyên a và b, tính toán c = a / b và bắt lỗi chia
		// cho 0
		System.out.println("Phần (a): Nhập và xử lý chia cho 0");
		try {
			System.out.print("Nhập vào số nguyên a: ");
			int a = scanner.nextInt();
			System.out.print("Nhập vào số nguyên b: ");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println("Kết quả của a / b = " + c);
		} catch (ArithmeticException e) {
			System.out.println("Lỗi: Không thể chia cho 0.");
		}

		// Xóa bộ đệm để đọc giá trị tiếp theo
		scanner.nextLine();

		// Phần (b): Nhập vào một chuỗi và chuyển đổi thành số nguyên
		System.out.println("Phần (b): Nhập và chuyển đổi chuỗi thành số nguyên");
		try {
			System.out.print("Nhập vào một chuỗi: ");
			String inputString = scanner.nextLine();

			int parsedNumber = Integer.parseInt(inputString);
			System.out.println("Chuỗi đã được chuyển đổi thành số nguyên: " + parsedNumber);
		} catch (NumberFormatException e) {
			System.out.println("Lỗi: Chuỗi nhập vào không phải là dạng số hợp lệ.");
		}

		scanner.close();
	}
}

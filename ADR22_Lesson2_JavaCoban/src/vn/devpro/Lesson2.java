package vn.devpro;

public class Lesson2 {

	public static void main(String[] args) {

		// I - Hàm trong java
		System.out.println("I - Hàm trong java.....");
		// - Có kiểu trả về. Tính tổng 2 số nguyên
		int kqua = tinhTong2So(10, 20);
		String s = "Tổng 2 số %d và %d là: %d";
		// Định dạng lại chuỗi mà thôi
		s = String.format(s, 10, 20, kqua);
		System.out.println(s);

		// - Hàm không cần trả về giá trị gì cả (void)
		hienThiTT();

		// Hàm không giới hạn tham số (...)

		float kq = tinh_Tich(2.0f, 5.0f, 10.0f);
		System.out.println("Kết quả: " + kq);

		// II. Sử dụng đệ quy
		System.out.println("II. Sử dụng đệ quy.....");
		// Đệ quy tức là hàm được gọi vào chính nó => Lặp vô hạn
		test();

		// Tính fx = 1 + 2 +...+n
		// n =3 => fx = 1 + 2 +3 = 6 = 3 + 2 +1

		int fx = tinhFX(3);
		System.out.println("fx = " + fx);

		// Dùng đệ quy tính n!

		// n =5 => fx =5*4*3*2*1

		fx = tinhGT(5);
		System.out.println("Giai thừa: " + fx);
		// Đệ quay java + c là như nhau

		// III.- Tham chiếu, tham Trị
		System.out.println("III. Tham chiếu, tham Trị...");
		// 1. Tham trị => truyền giá trị
		int x = 10;
		int y = x;// Khi x hoặc y thay đổi thì ko liên quan gì đến nhau
		y = 20;
		System.out.println("x = " + x);// 20,10
		System.out.println("y = " + y);// 20,30

		// Tình huống thứ 2
		System.out.println("----------");
		x = 10;
		thayDoi(x);// 20
		System.out.println("x = " + x);// 10

		// Trong Java tất các kiểu dữ liệu nguyên thủy thì
		// đều là truyền tham trị, không thể làm khác được

		// Trừ khi bạn dùng biến toàn cục

		// 2. Truyền tham chiếu hay gọi là tham biến
		// Trong Java chỉ có các kiểu dữ liệu như là class, Collections,
		// Interface
		// thì mới truyền được tham chiếu

		// Ví dụ:
		// Khai báo 1 đối tượng sinh viên
		Student sv1 = new Student();
		sv1.name = "A";

		Student sv2 = sv1;
		sv2.name = "B";
		sv1.name ="C";

		System.out.println(sv1.name);//
		System.out.println(sv2.name);//
		
		

	}

	public static void thayDoi(int x) {
		x += 10;
		System.out.println("thay doi: " + x);
	}

	/**
	 * Tính ngược
	 * 
	 * @param n
	 * @return
	 */
	public static int tinhGT(int n) {
		int kq = n;
		kq *= n > 1 ? tinhGT(n - 1) : 1;
		return kq;
	}

	/**
	 * n =3> fx = 3 + 2 +1
	 * 
	 * @param i
	 * @return
	 */
	public static int tinhFX(int i) {
		int fx = i;
		fx += i > 1 ? tinhFX(i - 1) : 0;
		return fx;
	}

	public static void test() {
		System.out.println("Đang test...");
		// test(); Lệnh gọi đệ quy
	}

	/**
	 * 
	 * @param x:
	 *            Truyền vào bao nhiêu tham số cũng được
	 * @return
	 */
	public static float tinh_Tich(float... x) {
		// x trở thành mảng
		// Duyệt mảng tính tổng cộng dồn (học trước)
		int kqua = 1;

		// Duyệt chỉ số mảng
		for (int i = 0; i < x.length; i++) {
			kqua *= x[i];// x[i] phần tử theo chỉ số
		}
		return kqua;
	}

	public static void hienThiTT() {
		System.out.println("My Name: Petter Scott");
		System.out.println("Hello everyone");
	}

	/**
	 * 
	 * @param x:
	 *            Tham số thứ nhất
	 * @param y:
	 *            Tham số thứ 2
	 * @return: Trả về kết quả là một số nguyên
	 */
	public static int tinhTong2So(int x, int y) {
		return x + y;
	}

}

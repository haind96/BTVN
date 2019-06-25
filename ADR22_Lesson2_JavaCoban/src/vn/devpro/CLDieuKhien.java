package vn.devpro;

public class CLDieuKhien {

	public static void main(String[] args) {
		// Các câu lệnh điều khiển
		// if, if else, else
		// Cho số nguyên kiểm tra nó chẵn hay lẻ
		int x = 10;
		// Like C
		if (x % 2 == 0) {
			System.out.println("Số chẵn");
		} else {
			System.out.println("Số lẻ");
		}

		// Cho chỉ số tháng => In ra mùa miền bắc
		// Nếu như chỉ số tháng ko hợp lệ thì in ra ko tồn tại tháng này
		int m = 11;// 1-12
		if (m >= 1 && m <= 12) {
			if (m <= 3)
				System.out.println("Mùa Xuân");
			else if (m <= 6) {
				System.out.println("Mùa Hè/Hạ");
			} else if (m <= 9) {
				System.out.println("Mùa Thu");
			} else {
				System.out.println("Mùa Đông");
			}
		} else {
			System.out.println("Chỉ số tháng ko hợp lệ");
		}

		// Nhận xét:
		// - Cách tiếp cận như c
		// - So sánh thì top - down
		// - if có thể lồng nhau thoải mái
		// - Các mệnh đề if, else if, else thì phải đặt trong dấu {}
		// tuy nhiên nếu nội dung chỉ có một dòng lệnh thì có thể bỏ {}
		// - Trong cú pháp () thì phải là toán tử so sánh hoặc là tổ hợp các toán tử so sánh
		
		//TH đặc biệt với KDL boolean
		
		boolean trangThai =true;
		
		if (trangThai) {//đầy đủ: trangthai==true
			System.out.println("Hello");
		}
		
		trangThai =false;
		if (!trangThai) {//trangthai==false
			System.out.println("Hi");
		}
		
		//Note: Không nên dùng if/else lồng nhau sâu quá => Tăng lên độ phức tạp của thuật toán
		//Độ phức tạp: Số phép so sánh, tính toán trong chươn trình

		
	}
}

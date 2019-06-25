package vn.devpro;

public class CauLenhReNhanh {

	public static void main(String[] args) {
		// Câu lệnh rẽ nhánh
		// Cho một chuỗi:
		// Nếu chuỗi đó "Hong" => Hoa Hong
		// .... "Lan" => Hoa Lan
		// else không biết

		// Các bạn dùng if..else cũng giải quyết được
		// Có một cách khác như sau
		String name = "Lan";
		switch (name) {// key: Là một giá trị: chuỗi, số nguyên, hằng số, enum
		case "Hoa": 
		case "Hong"://hoặc
			System.out.println("Hoa Hong");
			break;// Câu lệnh dừng, thoát khỏi case và witch
		case "Lan":
			System.out.println("Hoa Lan");
			break;//Có thể thay thế lệnh break bằng lệnh return;
		default:
			System.out.println("Không biết");
			break;
		}

		//Nhận xét:
		//- Nội dung () của switch phải là:bool, số nguyên (biến, hằng số), hoặc là chuỗi, hoặc là enum
		//- Có thể dùng if..else thay thế hoàn toàn được switch
		//- switch ko giải quyết được bài toán điều kiện và
		//nhưng điều kiện hoặc thì được
		//- Switch thì nhanh hơn if...else
		
	}
}

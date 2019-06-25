package java_node;

import java.util.Scanner;

public class node {

	enum GENDER {
		NAM, NU, KHAC;

		public static GENDER getEnum(int gender) {
			switch (gender) {
			case 0:
				return NU;
			case 1:
				return NAM;

			default:
				return KHAC;
			}
		}
	}

	private static void hienThiGT(GENDER gt) {

		switch (gt) {
		case NU:
			System.out.println("Gioi Tinh Nu");
			break;
		case NAM:
			System.out.println("Gioi Tinh Nam");
			break;

		default:
			System.out.println("Gioi tinh Khac");
			break;
		}
	}

	public static void main(String[] args) {
		int gender = 0;
		hienThiGT(GENDER.getEnum(gender));
	}

}

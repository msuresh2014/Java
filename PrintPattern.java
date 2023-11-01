package practice;

public class PrintPattern {

	public static void main(String args[]) {
		System.out.println("1 ------------------");
		System.out.println("");
		printTriangle1(5);
		System.out.println("");
		System.out.println("2 ------------------");
		System.out.println("");
		printTriangle2(5);
		System.out.println("");
		System.out.println(" 3------------------");
		System.out.println("");
		printTriangle3(5);
		System.out.println("");
		System.out.println("4 ------------------");
		System.out.println("");
		printTriangle4(5);
		System.out.println("");
		System.out.println(" 5------------------");
		System.out.println("");
		printTriangle5(5);
		System.out.println("");
		System.out.println("6 ------------------");
		System.out.println("");
		printTriangle6(5);
	}

	public static void printTriangle1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void printTriangle2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void printTriangle3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void printTriangle4(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(" *");
			}

			System.out.println("");
		}
	}

	public static void printTriangle5(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println("");
		}

	}

	public static void printTriangle6(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}

			System.out.println("");
		}

	}
}

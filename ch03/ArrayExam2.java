package ch03;

public class ArrayExam2 {

	public static void main(String[] args) {

		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);

		} // for문

		arr2[0] = 10.0;
		arr2[1] = 20.0;
		arr2[2] = 30.0;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "[" + arr2[i]);
		}
		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}

		arr3[0] = "김기원";
		arr3[1] = "엠아이티";
		arr3[2] = "자바";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
	}

}

package by.academy.classwork.Task3;

public class Matrix {
	public void arrSum () {

		int arr1[][] = { { 1, 3, 4 }, { 6, 3, 8 } };
		int arr2[][] = { { 3, 7, 3 }, { 4, 9, 8 } };
		int arrSum[][] = new int[2][3];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				arrSum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(arrSum[i][j]);
			}
		}
	}
	
	public void arrProizvedenie() {
		int arr1[][] = { { 1, 3, 4 }, { 6, 3, 8 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
System.out.println(arr1[i][j]*2);
				
			}
		}
	}

}

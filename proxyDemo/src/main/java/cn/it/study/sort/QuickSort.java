package cn.it.study.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] num = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
		sort(num, 0, num.length-1);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

	public static int part(int[] a, int i, int j) {
		int point = a[i];
		while (i < j) {

			while (i < j && a[j] >= point)
				j--;
			a[i] = a[j];
			while (i < j && a[i] <= point)
				i++;
			a[j] = a[i];
		}
		a[i] = point;
		return i;
	}

	public static void sort(int[] a, int i, int j) {

		if (i < j) {
			int part = part(a, i, j);
			sort(a, i, part-1);
			sort(a, part + 1, j);
		}
	}
}

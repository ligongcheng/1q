package cn.it.study.sort;

public class InsertSort {

	public static void main(String[] args) {
		int[] num = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
		int size = num.length;

		for (int i = 1; i < size; i++) {
			if (num[i] < num[i - 1]) {// 需要交换位置
				for (int j = i; j > 0 && num[j] < num[j - 1]; j--) {
					int temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
				}
			}
		}

		// 打印结果
		for (int k = 0; k < size; k++) {
			System.out.print(num[k] + " ");
		}
	}
}

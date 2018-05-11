package cn.it.study.sort;

public class SelectSort {

	public static void main(String[] args) {
		int[] num = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
		int size = num.length;
		//排size-1次
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			// 寻找最小数的位置
			for (int k = i; k < size; k++) {
				if (num[min] > num[k]) {
					min = k;
				}
			}
			// 将最小数和本次比较的首位交换位置
			int temp = num[i];
			num[i] = num[min];
			num[min] = temp;

		}
		//打印结果
		for (int i = 0; i < size; i++) {
			System.out.print(num[i]);
		}
	}
}

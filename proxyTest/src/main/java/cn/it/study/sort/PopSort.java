package cn.it.study.sort;

public class PopSort {

	public static void main(String[] args) {
		int[] num = {3,1,4,1,5,9,2,6,5,3};
		int size = num.length;
		int j = 0;
		for (int i = 1; i < size; i++) {
			for (j = 0; j < size-i; j++) {
				if(num[j] > num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
			
		}
		for (int i = 0; i < size; i++) {
			
			System.out.print(num[i]);
		}
	}
}

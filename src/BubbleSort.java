public class BubbleSort {
	public static void main(String[] args){
		new BubbleSort();
	}
	public BubbleSort() {
		int a[] = {1,23,34,5,67,2};
		int temp = 0;
		for (int i = 0;i < a.length;i++){
			for(int j = i + 1;j < a.length;j++){
				if (a[i] > a[j]){
					temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				  }
		}
		}
		for (int i = 0;i < a.length;i++)	
			System.out.println(a[i]);
	}
}

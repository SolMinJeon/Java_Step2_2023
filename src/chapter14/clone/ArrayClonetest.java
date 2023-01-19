package chapter14.clone;

public class ArrayClonetest {

	public static void main(String[] args) {

		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[];
		
		arr2 = arr1.clone();
		
		System.out.println("복사된 arr2배열");
		
		for(int i:arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		arr2[3] = 0;
		

		System.out.println("변경 후 arr1 뱅ㄹ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("변경 후 arr2 qoduf");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		

	}

}

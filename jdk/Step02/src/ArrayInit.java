
public class ArrayInit {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		boolean[] arr3 = new boolean[5];
		String[] arr4 = new String[5];
		
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
		for(int i=0;i<arr4.length;i++)
			System.out.print(arr4[i] + " ");
	}

}

package week1.day2;
import java.util.Arrays;

public class missingElementinArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=(i+1)) {
				System.out.println("missing number is"+(i+1));

			}
		}
			

	}

}

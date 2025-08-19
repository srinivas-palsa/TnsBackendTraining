// 1.Reversing an array 

/*
public class ArrayPrograms {

	public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};
	
	for(int i=arr.length-1;i>=0;i--) {
	
		System.out.print(arr[i]+"");
		
	}
}
}
*/




// 2.Max and Min values from an array

/*
public class ArrayPrograms{
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,12,45,99,56,28};
		
		int min=1000, max=0;
		
		for(int num:arr) {
			
			if(min>num) {
				min = num;
			}
			if(max<num) {
				max=num;
			}
		}
	
		System.out.println("Minimum value in the array is:"+min);
		System.out.println("Maximum value in the array is:"+max);

	}
	
}
*/




// 3.Finding duplicates from an array

/*
public class ArrayPrograms{
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,1,2,3,45,6,75,45,8,8,6};
		
		System.out.print("Duplicates: ");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}

*/




// 4.Sorting an array(Ascending order)

/*
import java.util.Arrays;

public class ArrayPrograms{
	
	public static void main(String[] args) {
		
		int[] arr = {5,34,7,8,2,56,6};
		
		Arrays.sort(arr);
		
		System.out.println("Sorted: "+Arrays.toString(arr));
		
	}
}
*/




/// 5.Second largest element

public class ArrayPrograms{
	
	public static void main(String[] args) {
		
		int []arr= {2,34,5,6,23,5,99};
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		
		for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
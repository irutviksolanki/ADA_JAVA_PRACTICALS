import java.util.Scanner; 
class LinearSearch
{ 
	public static int linearsearch(int[] arr, int key)
	{ 
		for(int i=0; i<arr.length; i++)
		{ 
			if(arr[i] == key)
			{ 
				return i; 
			} 
		} 
		return -1; 
	} 
	public static void main(String[] args) 
	{ 
		int lin_arr[] = {45,28,19,7,6,94,35,94}; 
		System.out.print("List if numbers : "); 
		for (int i : lin_arr) 
		{ 
			System.out.print(i+" "); 
		} 
		int searchedItem; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("\nEnter the number which you want to search : "); 
		searchedItem = sc.nextInt(); 
		System.out.print(searchedItem+" is found at index "+linearsearch(lin_arr, searchedItem)); 
	} 
} 
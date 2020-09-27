import java.util.Scanner;
public class BubbleSortExample 
{  
    static void bubbleSort(int[] arr) 
	{  	
		
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
		{  
            for(int j=1; j < (n-i); j++)
			{  
                if(arr[j-1] > arr[j])
				{  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }             
            }  
        }  
    }  
    public static void main(String[] args) 
	{  	
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		b= sc.nextInt();
        int arr[] = new int[b];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < b; i++)
        {
            arr[i] = sc.nextInt(); 
		}	
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++)
		{  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();            
        bubbleSort(arr);//sorting array elements using bubble sort  
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++)
		{  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
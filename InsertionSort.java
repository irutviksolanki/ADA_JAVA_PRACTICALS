import java.util.Scanner;
public class InsertionSort 
{  
    public static void insertionSort(int array[])
	{  
        int n = array.length;  
        for (int j = 1; j < n; j++) 
		{  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) 
			{  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[])
	{   
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		b= sc.nextInt();
        int arr1[] = new int[b];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < b; i++)
        {
            arr1[i] = sc.nextInt(); 
		}	   
        System.out.println("Before Insertion Sort");    
        for(int i:arr1)
		{    
            System.out.print(i+" ");    
        }    
        System.out.println();      
        insertionSort(arr1);//sorting array using insertion sort 
        System.out.println("After Insertion Sort");    
        for(int i:arr1)
		{    
            System.out.print(i+" ");    
        }    
    }    
}   
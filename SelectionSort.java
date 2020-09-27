import java.util.Scanner;
public class SelectionSort 
{  
    public static void selectionSort(int[] arr)
	{  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
			{  
                if (arr[j] < arr[index])
				{  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
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
        System.out.println("Before Selection Sort");  
        for(int i:arr1)
		{  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1)
		{  
            System.out.print(i+" ");  
        }  
    }  
}  
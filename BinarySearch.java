import java.util.Scanner; 
class BinarySearch{ 
 public static int binarySearch(int[] b_arr, int start, int end, int item){ 
   int mid; 
   if(start <= end){ 
    mid = (start + end)/2; 
    if (b_arr[mid] == item) { 
     return mid + 1; 
    } 
    else if(b_arr[mid] < item){ 
     return binarySearch(b_arr,mid+1,end,item); 
    } 
    else{ 
     return binarySearch(b_arr,start,mid+1,item); 
    } 
   } 
   return -1; 
 } 
 public static void main(String[] args) { 
  int bin_arr[] = {6,7,15,27,38,43,48,56,65}; 
  //int bin_arr[] = {}; 
  int itemSearch, position = -1; 

  //System.out.println("---------- LinearSearch ---------"); 
  System.out.print("List of number for binary search : "); 
  for (int i : bin_arr) { 
   System.out.print(i+" "); 
  } 
  System.out.print("\nTotal size of list : "+bin_arr.length); 
  System.out.print("\nEnter the number which you want to search : "); 
  Scanner sc = new Scanner(System.in); 
  itemSearch = sc.nextInt(); 
  position  = binarySearch(bin_arr,0,bin_arr.length,itemSearch); 
  if(position != -1){ 
   //System.out.println("-------------------------------------------------"); 
   System.out.println("The positon of the searched item is : "+position); 
  } 
  else{ 
   System.out.println("searched item not found !!!"); 
  } 
 } 
} 
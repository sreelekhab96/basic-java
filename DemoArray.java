// WAP TO SAVE ELEMENTS TO A JAVA ARRAY AND PRINT

import java.util.*;
class DemoArray{
public static void main(String []args){
Scanner sn = new Scanner(System.in);
System.out.print("Enter the size of Array : "); // i.e no of elements that you want to store , size of array cannot be changed once declared
int size = sn.nextInt();
int ar[] = new int[size];
for(int i = 0 ;i<size;i++){
System.out.print("Enter the Element "+i+" : ");
ar[i] = sn.nextInt(); // will store the element at index i
}
System.out.println("The elemnts of array are");

// accessing and printing the elements of array
for(int i = 0 ;i<size;i++){
System.out.print(ar[i]+" ");
}
System.out.println();
}
}
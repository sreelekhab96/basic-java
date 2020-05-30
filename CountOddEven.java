import java.util.*;
class CountOddEven{
public static void main(String []args){
Scanner sn = new Scanner(System.in);
System.out.print("Enter the Number ");
int num = sn.nextInt();
int odd = 0,even = 0,rem = 0;
while(num != 0){
rem = num%10;
if(rem%2==0){
even++;
}else{
odd++;
}
num = num/10;
}
System.out.println("No of Odd Digits: "+odd);
System.out.println("No of Even Digits : "+even);
}
}
import java.util.*;

class Max{
public static void main (String []args){
Scanner sn = new Scanner(System.in);
System.out.print("Enter First Number : ");
int num1 = sn.nextInt();
System.out.print("Enter Second Number : ");
int num2 = sn.nextInt();

System.out.print("Enter Third Number : ");
int num3 = sn.nextInt();
if(num1>num2)
{
if(num1>num3)
{
System.out.println("Largest among entered Number is : "+num1);
}
else
{
System.out.println("Largest among entered Number is : "+num3);
}

}else
{
if(num2>num3)
{
System.out.println("Largest among entered Number is : "+num2);
}
else
{
System.out.println("Largest among entered Number is : "+num3);
}
}
}
}
class Dividenumber{
public static void main(String[]args)
{
int rem=0,sum=0,num=361;
while(num!=0)
{
rem=num%10;
sum=(sum+rem);
num=num/10;
}
System.out.println(sum);
//This is comment
}
}






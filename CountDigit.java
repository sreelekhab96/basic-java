class CountDigit{
public static void main(String[]args)
{
int rem=0,num=789456,count=0;
while(num!=0)
{
rem=num%10;
num=num/10;
count++;
}
System.out.println(count);
//This is comment
}
}






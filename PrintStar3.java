class PrintStar3
{
public static void main(String[]args)
{
int n=5;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++)
{
System.out.print("* ");
try{
Thread.sleep(1000);
}
catch(Exception ex){
System.out.print(ex.getMessage());
}
}
System.out.println();
//this is comment
}
}
}

class PrintStar5
{
public static void main(String[]args)
{
int n=5;
String name = "Sreelekha Biswas";
for(int i=0;i<=name.length();i++){
for(int j=1;j<=i;j++)
{
System.out.print(name.charAt(j-1)+" ");
try{
Thread.sleep(500);
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
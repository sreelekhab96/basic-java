class DemoE{
public static void main(String []args){
int num1 = 45;
int num2 = 0;

try{
int num3 = num1/num2;
System.out.println(num3);
System.out.println("This line Will not execute an exception occurs");
}catch(Exception ex){
System.out.println("An Exception has occurred : "+ex.getMessage());
}
System.out.println("HI i am Sreelekha");
}
}
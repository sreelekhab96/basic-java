class TypeCasting{
public static void main(String []args){
int num1 = 5;
int num2 = 2;
int num3 = num1/num2;
System.out.println("Q1 "+num3);

float num4 = num1/num2;
System.out.println("Q2 "+num4);

num4 = (float)num1/num2;
System.out.println("Q3 "+num4);

//int x = num4; // will cause error loss of precision
int x = (int)num4; // will convert float to int


System.out.println(x);
}
}
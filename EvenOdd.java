class EvenOdd{
public static void main(String args[]){
int num = 12;
MyFunction(num);
}
//}
static void MyFunction(int num){
if(num%2==0)
{
System.out.println("even");
}
else{
System.out.println("odd");
}
}
}
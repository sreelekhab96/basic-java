class ByteDemo{
public static void main(String []args){
byte b = 10;
//b = b+1; // will cause error bcouz will convert to int internally
b++; // convert int to byte internally b = (byte)b+1;
System.out.println(b);
}
}
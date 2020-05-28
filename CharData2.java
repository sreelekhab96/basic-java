class CharData2{
public static void main(String []args){
char c = 65;
for(int i = 0;i<26;i++){
System.out.println("ASCII code of "+(char)(c+i)+" : "+(c+i));
}

System.out.println();
c = 97;
for(int i = 0;i<26;i++){
System.out.println("ASCII code of "+(char)(c+i)+" : "+(c+i));
}
}
}
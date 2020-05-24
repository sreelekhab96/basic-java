import javax.swing.*;

class GUI{
public static void main(String []args){
int i = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
System.out.println(i);
JOptionPane.showMessageDialog(null,i);
}
}
import javax.swing.JOptionPane;
public class Ex34 {
    public static void main(String args[]){
        int i;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        for (i=1;i<=10;i++){
            if (i==10){
                System.out.print(num*i);
            }
            else{
                System.out.print(num*i+", ");
        }
    }
} 
}

import javax.swing.JOptionPane;
public class Ex32 {
    public static void main(String args[]){
        int i,fat = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        for (i=num;i>1;i--){
            fat*=i;
        }
        JOptionPane.showMessageDialog(null,"O fatorial do seu numero é: "+fat);
    }
}

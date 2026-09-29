import javax.swing.JOptionPane;
public class Ex33 {
    public static void main(String args[]){
        int i=1;
        double soma = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        for (i=1;i<=num;i++){
            soma = soma + (1.0/i);
        }
        JOptionPane.showMessageDialog(null,"O resultado da soma é: "+soma);
    }
}

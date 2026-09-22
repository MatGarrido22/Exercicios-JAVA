import javax.swing.JOptionPane;
public class Ex07 {
    public static void main (String args []){
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        int volume = c*a*l;
        JOptionPane.showMessageDialog(null,"O volume do seu paralelepipedo é: "+volume);
    }
}

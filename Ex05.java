import javax.swing.JOptionpane;
public class Ex5 {
    public static void main (String args[]){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite quem acompanha o X²: ));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite quem acompanha o X: ));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero sozinho: ));
        double delta = (B*B) - (4*A*C);
        double raiz1 = (-B + Math.sqrt(delta))/(2*A);
        double raiz2 = (-B - Math.sqrt(delta))/(2*A);
        JOptionPane.showMessageDialog(null,"O valor da raiz 1 é: "+raiz1+" e o valor da raiz 2 é: "+raiz2);
}

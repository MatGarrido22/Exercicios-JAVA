import javax.swing.JOptionPane;
public class Ex11 
{
    public static void main (String args[])
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio da circunferencia: "));
        final double PI = 3.14;
        double c = 2*r*PI;
        JOptionPane.showMessageDialog(null, "O valor da circunferencia do seu circulo é: "+ c);
        
    }
}

import javax.swing.JOptionPane;
public class Ex1 
{
    public static void main (String args[])
    {
        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        float Area = x * x;
        JOptionPane.showMessageDialog(null, "A área do seu quadrado é de " + Area + " metros quadrados");
    }
}

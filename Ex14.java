import javax.swing.JOptionPane;
public class Ex14 
{
    public static void main (String args [])
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro angulo: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo angulo: "));
        double z = 180-x-y;
        JOptionPane.showMessageDialog(null,"O valor do terceiro angulo do seu triangulo é: "+z+" graus");
    }
}

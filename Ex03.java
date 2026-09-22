import javax.swing.JOptionPane;
public class Ex3 
{
    public static void main (String args [])
    {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do seu triângulo: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do seu triângulo: "));
        float area = (base * altura)/2;
        JOptionPane.showMessageDialog(null,"A area do seu triângulo é: " + area + " metros quadrados");
    }
}

import javax.swing.JOptionPane;
public class Ex4 
{
    public static void main (String args [])
    {
        int tempC = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em graus celsius: "));
        int tempF = (9*tempC+160)/5;
        JOptionPane.showMessageDialog(null,"Sua temperatura em fahrenheit é: " + tempF);
    }
}

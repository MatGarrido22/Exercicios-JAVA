import javax.swing.JOptionPane;
public class Ex13 
{
    public static void main (String args[])
    {
        double alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento que você tem em quilos: "));
        double tempo = alimento*20;
        JOptionPane.showMessageDialog(null,"Sua quantidade de alimento vai durar: "+tempo+" dias");
        
    }
}

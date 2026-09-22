import javax.swing.JOptionPane;
public class Ex15 
{
    public static void main(String args[])
    {
        int catA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        int catB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        double hip = Math.sqrt((catA*catA)+(catB*catB));
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: "+hip);
    }
}

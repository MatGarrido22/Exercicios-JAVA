import javax.swing.JOptionPane;
public class Ex08 
{
    public static void main (String args [])
    {
        int deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        double valorTotal = deposito + (deposito*0.013);
        JOptionPane.showMessageDialog(null,"O valor depois do reajuste de 1 mês é de: "+ valorTotal);
    }
}

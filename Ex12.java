import javax.swing.JOptionPane;
public class Ex12 
{
    public static void main (String args [])
    {
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        int idade = anoAtual - anoNasc;
        JOptionPane.showMessageDialog(null,"Sua idade é: "+idade+" anos e daqui 17 anos você vai ter: "+ (idade+17)+ " anos" );
    }
}

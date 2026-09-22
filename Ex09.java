import javax.swing.JOptionPane;
public class Ex09 
{
    public static void main (String args[])
    {  
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        int quadrados = (2*x*y)+(y*y)+(x*x);
        JOptionPane.showMessageDialog(null,"O valor da soma dos quadrados dos seus números é de: "+ quadrados);
    }
}

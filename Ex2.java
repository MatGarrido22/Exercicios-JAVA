import javax.swing.JOptionPane;
public class Ex2
{
    public static void main (String args[])
     {
         double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
         double salario_novo = salario * 1.15;
         JOptionPane.showMessageDialog(null,"O salário do funcionário após o reajuste é de: " + salario_novo + " reais");
     }
}

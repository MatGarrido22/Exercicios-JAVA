import javax.swing.JOptionPane;
public class Ex21 
{
    public static void main (String args[])
    {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota: "));
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media>=6)
        {
            JOptionPane.showMessageDialog(null,"Aprovado, média: "+media);
        }
        else
        {
            if(media<6 && media>=3)
            {
                JOptionPane.showMessageDialog(null,"Exame, média: "+media);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Reprovado, média: "+media);
            }
        }
    }    
}

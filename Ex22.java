import javax.swing.JOptionPane;
public class Ex22 
{
    public static void main (String args [])
    {
        int maior,menor;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro valor: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo valor (diferente do primeiro): "));
        if (x==y)
        {
            JOptionPane.showMessageDialog(null,"Eu disse diferente");
        }
        else
        {
            if (x>y)
            {
                maior = x;
                menor = y;
            }
            else
            {
                maior = y;
                menor = x;
            }
        JOptionPane.showMessageDialog(null,"Os valores em ordem crescente são: "+maior+ ", "+ menor);
        }
    }
}

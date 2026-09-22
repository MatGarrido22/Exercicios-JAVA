import javax.swing.JOptionPane;
public class Ex18 
{
    public static void main (String args [])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro valor: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo valor: "));
        int dif;
        if (x>y)
        {
            dif = x-y;
        }
        else
        {
            dif = y-x;
        }
        JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é: " + dif);
    }
}

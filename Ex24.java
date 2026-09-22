import javax.swing.JOptionPane;
public class Ex24 
{
    public static void main (String args [])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite seu valor: "));
        if (x%2==0)
        {
            if (x%3==0)
            {
                JOptionPane.showMessageDialog(null,"O numero é divisivel por 2 e 3");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"o número é divisivel só por 2");
            }
        }
        else
        {
            if (x%3==0)
            {
                JOptionPane.showMessageDialog(null,"o número é divisivel só por 3");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"o numero não é divisivel nem por 2 nem por 3");
            }}}}
import javax.swing.JOptionPane;
public class Ex19 
{
    public static void main (String args [])
    {
        float maior = 0;
        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite seu primeiro valor: "));
        float y = Float.parseFloat(JOptionPane.showInputDialog("Digite seu segundo valor: "));
        if (x==y)
        {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
        else
        {
            if (x>y)
            {    
                maior = x;
            }
            else
            {
                maior = y;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior valor é: "+ maior);
    }
}

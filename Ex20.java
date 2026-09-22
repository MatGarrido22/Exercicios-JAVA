import javax.swing.JOptionPane;
public class Ex20 
{
    public static void main (String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite quem acompanha x²: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite quem acompanha x: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor sozinho: "));
        double delta = b*b-4*a*c;
        double raiz1,raiz2;
        if (delta<0)
        {
            JOptionPane.showMessageDialog(null,"A equação não tem raiz real");
        }
        else
        {
            if (delta==0)
            {
                raiz1 = -b + Math.sqrt(delta)/2*a;
                JOptionPane.showMessageDialog(null,"A equação tem duas raizes reais iguais: "+ raiz1);
            }
            else
            {
                raiz1 = -b + Math.sqrt(delta)/2*a;
                raiz2 = -b - Math.sqrt(delta)/2*a;
                JOptionPane.showMessageDialog(null,"A equação tem duas raizes reais diferentes: "+raiz1+ " "+ raiz2);
            }
        }
    }
}

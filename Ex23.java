import javax.swing.JOptionPane;
public class Ex23 
{
    public static void main (String args[])
    {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite os 3 primeiros valores em ordem crescente\nDigite seu primeiro valor: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu segundo valor: "));
        if (valor1>valor2)
        {
            JOptionPane.showMessageDialog(null,"Eu disse >em ordem crescente<");
        }
        else
        {
            double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu terceiro valor: "));
            if (valor3<valor2)
            {
                JOptionPane.showMessageDialog(null,"Eu disse >em ordem crescente<");
            }
            else
            {
                double valor4 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu quarto valor: "));
                if (valor4<=valor1)
                {
                    JOptionPane.showMessageDialog(null,"A ordem crescente dos 4 valores é: "+valor4+", "+valor1+", "+valor2+", "+valor3);
                }
                else
                {
                    if (valor4<=valor2 && valor4>valor1)
                    {
                        JOptionPane.showMessageDialog(null,"A ordem crescente dos 4 valores é: "+valor1+", "+valor4+", "+valor2+", "+valor3);
                    }
                    else
                    {
                        if(valor4<=valor3 && valor4>valor2)
                        {
                            JOptionPane.showMessageDialog(null,"A ordem crescente dos 4 valores é: "+valor1+", "+valor2+", "+valor4+", "+valor3);
                        }
                        else
                        {
                            if(valor4>valor3)
                            {
                                JOptionPane.showMessageDialog(null,"A ordem crescente dos 4 valores é: "+valor1+", "+valor2+", "+valor3+", "+valor4);
                            }}}}}}}}
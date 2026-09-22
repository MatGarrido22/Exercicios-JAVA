import javax.swing.JOptionPane;
public class Ex10 
{
    public static void main (String args[])
    {
        float a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do seu primeiro número: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do seu segundo número: "));
        float dif = a - b;
        JOptionPane.showMessageDialog(null, "A diferença entre do seu primeiro número pro segundo é de: "+dif);
    }
}

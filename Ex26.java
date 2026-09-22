import javax.swing.JOptionPane;
public class Ex26 
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro valor: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo numero: "));
        int maior, menor;
        if (x-y>0){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }
        if (maior%menor==0){
            JOptionPane.showMessageDialog(null,maior+" é multiplo de "+menor);
        }
        else{
            JOptionPane.showMessageDialog(null,maior+" não é multiplo de "+menor);
        }
    }
}

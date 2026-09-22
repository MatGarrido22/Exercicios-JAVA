import javax.swing.JOptionPane;
public class Ex06 {
    public static void main (String args[]){
        int aux;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
        aux = x;
        x = y;
        y = aux;
        JOptionPane.showMessageDialog(null,"Os valores de x e y depois da troca são, respectivamente:"+x+" e "+y);
    
    }
}
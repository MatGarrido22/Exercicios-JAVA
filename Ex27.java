import javax.swing.JOptionPane;
public class Ex27 
{
    public static void main (String args[])
    {
        int voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
        int extensao = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do percurso (em metros): "));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo que durou a corrida (em minutos): "));
        float vel_media = ((voltas*extensao)/1000)/tempo;
        JOptionPane.showMessageDialog(null,"A velocidade media foi de: "+vel_media+" km/h");
    }
}

import javax.swing.JOptionPane;
public class Ex25 
{
    public static void main (String args[])
    {
        int hora_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite que hora começou o jogo: "));
        int min_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite que minuto começou o jogo: "));
        int hora_final = Integer.parseInt(JOptionPane.showInputDialog("Digite que hora terminou o jogo: "));   
        int min_final = Integer.parseInt(JOptionPane.showInputDialog("Digite que minuto terminou o jogo: "));
        int total = (hora_inicial * 60 + min_inicial)-(hora_final*60 + min_final);
        if (total>1440){
            JOptionPane.showMessageDialog(null,"O jogo durou mais de 24 horas");
        }
        else{
            if(total<0){    
                total = total*-1;
            }
            JOptionPane.showMessageDialog(null,"O jogo durou "+(total/60)+" hora(s) e "+(total%60)+" minuto(s)");
        }
    }
}

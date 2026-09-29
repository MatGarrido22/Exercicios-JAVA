import javax.swing.JOptionPane;
public class Ex29 {
    public static void main(String args[]){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento, 1 pra poupança e 2 pra renda fixa: "));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite quanto voce vai investir: "));
        double valorNovo = 0;
        if (tipo ==1){
            valorNovo = valor*1.03;
        }
        else{
            if(tipo==2){
                valorNovo = valor*1.05;
            }
            else{
                System.out.println("Tipo invalido");
            }
        }
        JOptionPane.showMessageDialog(null,"O valor depois do reajuste é: "+valorNovo);
    }
}

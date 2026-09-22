import javax.swing.JOptionPane;
public class Ex28 {
    public static void main(String args[]){
        int precoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor atual: "));
        int mediaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a media mensal: "));
        double precoNovo;
        if (precoAtual<30 && mediaMensal<500){
            precoNovo = precoAtual*1.1;
        }
        else{
            if (precoAtual>=30 && precoAtual<80 && mediaMensal>=500 && mediaMensal <1000){
                precoNovo = precoAtual*1.15;
            }
            else{
                if(precoAtual>=80 && mediaMensal>=1000){
                    precoNovo = precoAtual * 0.95;
                }
                else{
                    precoNovo = precoAtual;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"O preço depois do reajuste é: "+precoNovo);
    }
}

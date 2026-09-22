import javax.swing.JOptionPane;
public class Ex16 
{
    public static void main(String args[])
    {
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas horas vão ser trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite de 0 a 100 o percentual a ser descontado (sem %): "));
        int descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos descendentes você tem: "));
        double salBruto = horasTrabalhadas * valorHora;
        double salLiquido = salBruto * (1-(desconto/100)) + descendentes*100;
        JOptionPane.showMessageDialog(null,"O salário liquido é de: "+ salLiquido + " reais");
    }
}

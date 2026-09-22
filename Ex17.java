import javax.swing.JOptionPane;
public class Ex17 
{
    public static void main (String args [])
    {
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo que a viagem demorou em horas: "));
        double velocidadeM = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média da viagem em km/h: "));
        double distancia = velocidadeM * tempo;
        double litros = distancia/12;
        JOptionPane.showMessageDialog(null, "O consumo em litros de gasolina é de: "+litros);
    }
}

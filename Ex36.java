import javax.swing.JOptionPane;
public class Ex36{
    public static void main(String args[]){
	int i;
        int fat;
	double soma=1;
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        for(i=1;i<=numero;i++){
            fat = Ffat(i);
            soma += 1.0/fat;
        }
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
        }
	public static int Ffat(int num){
		int i;
                int fat = 1;
		for (i=1;i<=num;i++){
			fat*=i;
		}
		return fat;
	}
}

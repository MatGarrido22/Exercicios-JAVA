import javax.swing.JOptionPane;
public class Ex35 {
    public static void main (String agrs[]){
        int maior,menor,soma = 0;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor: "));
        
        if(n1==n2){
            JOptionPane.showMessageDialog(null,"Valores sao iguais");
        }
        if (n1>n2){
            maior = n1;
            menor = n2;
        }
        else{
            maior = n2;
            menor = n1;
            }
        if(menor%2!=0){
            while(menor<maior-2){
                menor+=2;
                soma+=menor;
            }
        }
        else{
            menor+=1;
            while(menor<=maior-1){
                soma+=menor;
                menor+=2;
            }
        }
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
    }
    
}

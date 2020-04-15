
import java.util.Scanner;
public class Combustivel {

    public static void main(String args[]){
    
        Scanner teclado = new Scanner(System.in);
    
        int tempo, velocidade;
        double consumo;
    
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
    
        consumo = velocidade / 12.0 * tempo;
    
        System.out.printf("%.3f\n", consumo);
    
        }
    
    }
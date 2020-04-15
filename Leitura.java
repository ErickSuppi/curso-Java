/*
este programa eh um exemplo de como se fazer uma leitura de dados
vinda do teclado, um pequeno calculo e, finalmente, exiir o valor
final na tela
*/
import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int valor;
        Systm.out.print("Por favor, digite um valor");
        valor = teclado.nextInt();
        
        /* processamento */
        valor = valor*100;

        System.out.print( "Novo valor " + valor)




    }
}

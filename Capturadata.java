
public class Capturadata {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int dia, mes, ano, res, data;

        System.out.print("Digite uma data (DDMMAAAA): ");
        numero = teclado.nextInt();


        ano = data % 10000;
        res = data / 10000;

        dia = res / 100;
        mes = res % 100;
        
        System.out.println(" Dia = "+dia);
        System.out.println(" Dia = "+mes);
        System.out.println(" Dia = "+ano);

    }


}
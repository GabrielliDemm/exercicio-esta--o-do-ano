import java.util.Scanner;

public class EstaçõesDoAno {

    public static void main(String[] args) {
        //Declaração de variaveis
        int mes, dia;

        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentção
        System.out.println("\n\t\t\t -- Estações do Ano --\n");

        //Entrada
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.println("Imforme o mês");
        mes = entrada.nextInt();


        //processamento
        if ((mes == 1) || (mes == 2) || (mes == 3)){
            if((mes == 3) && (dia >= 20)){
                System.out.println("É outono");
            }else {
                System.out.println("É verão!");
            }
        } else if ((mes == 4) || (mes == 5) || (mes == 6)){
            if((mes == 6) && (dia >= 20)){
            System.out.println("É Inverno<3");
            }else {
            System.out.println("É Outono!");
            }
        }else if ((mes == 7) || (mes ==8) || (mes == 9)){
            if((mes == 9) && (dia >= 22)){
                System.out.println("É Primavera!");
            }else {
            System.out.println("É Inverno<3");
            }
        }else if ((mes == 10) || (mes == 11)|| (mes == 12)){
            if((mes == 12) && (dia >= 21)){
                System.out.println("É verão!");
            }else {
                System.out.println("É Primavera!");
            }
        
        }else

        //não é mês
        System.out.println("mês" + mes + "não existe >:(");


    }
}
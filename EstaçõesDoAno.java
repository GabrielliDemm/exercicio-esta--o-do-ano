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
        switch (mes) {
            case 1:
            case 2:
            case 3:
                //saida
                if((mes == 3) && (dia >= 20)){
                    System.out.println("É outono");
                }else {
                    System.out.println("É verão!");
                }
                break;
            case 4:
            case 5:
            case 6:
                //saida
                if((mes == 6) && (dia >= 20)){
                System.out.println("É Inverno<3");
                }else {
                System.out.println("É Outono!");
                }
                break;
            case 7:
            case 8:
            case 9:
                //saida
                if((mes == 9) && (dia >= 22)){
                    System.out.println("É Primavera!");
                }else {
                System.out.println("É Inverno<3");
                }
                break;
            case 10:
            case 11:
            case 12:
                //saida
                if((mes == 12) && (dia >= 21)){
                    System.out.println("É verão!");
                }else {
                    System.out.println("É Primavera!");
                }
                break;
            default:
                //saida
                System.out.println("mês" + mes + "não existe >:(");
        }

    }
}
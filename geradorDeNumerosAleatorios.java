
import java.util.Random;
import java.util.Scanner;
public class geradorDeNumerosAleatorios {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gere números aleatorios para sua aposta:");

        System.out.println("Por favor, Insira a quantidade de números a serem gerados:");
            int quantidadeNumeros = ler.nextInt();
        System.out.println("Qual o valor limite dos números?");
             int valorLimite = ler.nextInt();
                if (quantidadeNumeros > valorLimite){
                    System.out.println("O valor limite deve maior que a quantidade de numeros, para que não haja números repetidos.");
                    return;
                }


             int [] numerosAleatorios = new int[quantidadeNumeros];

             // gera os números aleatorios com possivel repetiçao
             boolean repetido;
             for(int i = 0; i < quantidadeNumeros;i++){
                // vai ser executado ate que se encontre um numero diferente 
                do {
                     repetido = false;
                     numerosAleatorios[i] = random.nextInt(valorLimite);
                    for(int j = 0; j < i;j++){
                        if (numerosAleatorios[i] == numerosAleatorios[j]){
                           repetido = true;
                           break;
                        }
                     } 
                }  while(repetido); 

        }
            for(int numero : numerosAleatorios){
                System.out.println(numero);
    }
        }
    }
            
             



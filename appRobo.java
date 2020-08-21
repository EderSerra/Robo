package exercicios.Robo;

import java.util.Scanner;

import sun.security.ssl.SSLContextImpl.DefaultSSLContext;

public class appRobo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Robo robo1 = new Robo(deslocamento);
        char deslocar;
        int posicao;

        System.out.println("A posicão inicial é (0,0)");

        while(deslocar<>"F"){
            System.out.println("Deslocar para N, S, L ou O? (ou F para finalizar) ";
            deslocar = entrada.nextLine();

            robo1.desloc(deslocar);

            System.out.println("Posição atual: "; + 
        }

        entrada.close();
        
    }
    
}
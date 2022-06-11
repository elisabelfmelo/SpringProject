package br.com.eteavs.domain.SpringBoot;
import java.util.Scanner;

public class DigUnico {
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int  input = scanner.nextInt();
    Integer resultado = 0;
    
    while (input != 0){
    resultado  = resultado + input % 10;
    input = input/10;
}

 
    System.out.println("Digito = "+ resultado);    
    
  }
}

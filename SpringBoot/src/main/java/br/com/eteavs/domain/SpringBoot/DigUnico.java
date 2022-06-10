package br.com.eteavs.domain.SpringBoot;

import java.util.Scanner;

public class DigUnico{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número: ");
    
    int  n = scanner.nextInt();
    int soma = 0;

    while (n !=0){
      int digito = n %10;
      System.out.println(digito);

      if(digito%2==0){
        soma +=digito;
      }
      n  =n/10;
    }
    scanner.close();

    System.out.println("Digito = "+ "digito");

 
    
    
  }
}
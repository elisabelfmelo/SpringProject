import java.util.Scanner;

public class DigUnico{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in)
    
    int  n = scanner.scanner.nextInt();
    int soma = 0;

    while (n !=0){
      int digito = n %10;
      System.out.println(digito);

      if(digito%2=0){
        soma +=digito;
      }
      n  =n/10;
    }

    System.out.println("Digito = "+digito);

 
    
    
  }
}
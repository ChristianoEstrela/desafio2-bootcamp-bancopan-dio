package dio.bancopan.desafio2;

import java.io.IOException;
import java.text.Format;
import java.util.Scanner; 

public class DIO {
	  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0 ;
     int vp = 0;
     double soma = 0;
     double media = 0;
     double x;
          
     for (cont = 0; cont <= 5; cont++) {
          System.out.println();
          x =  leitor.nextDouble();
            if(x > 0) {
              vp++;
              soma += x;
            }
        
     }          
   
     media = soma/vp ;
     System.out.println(vp + " valores positivos");
     System.out.println(String.format("%.1f",media));
}
}

  
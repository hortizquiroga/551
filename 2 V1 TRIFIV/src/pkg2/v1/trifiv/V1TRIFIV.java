
package pkg2.v1.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V1TRIFIV {

   
    public static void main(String[] args) throws IOException {
        //Declaración de variables
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            int numero;
            int mult3;
            int mult5;
        //Entrada de datos
            System.out.println("Dame el numero: ");
            numero = Integer.parseInt( bufEntrada.readLine());
            
        //Procesar datos
            mult3= numero % 3;
            mult5 = numero % 5;
            
        //Salida de datos
            if( mult3== 0 ){
                System.out.println("TRI");
            }
            
            if( mult5 == 0){
                System.out.println("FIV");
            }
            
            if( mult3==0 && mult5 ==0){
                System.out.println("TRIFIV");
            }
            
       
            
            
        
        
    }
    
}

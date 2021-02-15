import java.util.Scanner;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.io.*;


public class Palindro {
    static Scanner teclado = new Scanner(System.in); 
    static char[] texto; 
    static String palabra = "";
    static String[] noPalindromo = new String[20];

    static boolean palindromo(String p){
        char[] pa = p.toCharArray();
        int largo = pa.length; 

        for(int i = 0; i < largo; i++){
            if(pa[i] == pa[largo-i-1]){
                ;
            }
            else{
                return false; 
            }
        }
        return true; 
    }

    static void searchPalindromos(char[] entrada){
        texto = entrada; 

        int n = 0; 
        
        for(int i = 0; i < texto.length; i++){
            
            if(texto[i] == ','){ 
                if(palindromo(palabra)){
                    palabra = "";  
                }
                else{
                    noPalindromo[n] = palabra; 
                    n++; 
                    palabra = ""; 
                }
                i = i+2;
            }

            try {
                palabra += texto[i];
            } catch (Exception e) {
                break; 
            }
        }

    }

    static void imprimirPalindromos(){
        System.out.println("\n\nNO PALINDROMOS");

        for(int i = 0; i < 50; i++){

            String imprimir = noPalindromo[i]; 
            
            if(imprimir == null){
                break;
            }
            else{
                System.out.println(imprimir);
            }
        }
    }

    static String[] execute(char [] entrada){
        texto = entrada; 

        searchPalindromos(texto); 

        imprimirPalindromos(); 

        return noPalindromo; 
    }

    public static void main(String[] arg) {
        /*
        try  {  
        //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("palabras.csv"));
            System.out.prinln(br.readLine().toString());  
            texto = br.readLine().toCharArray(); 

        
        while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
            String[] employee = line.split(splitBy);    // use comma as separator  
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
            }
        
        }   
        catch (IOException e){  
            e.printStackTrace();  
        } 
        */

        System.out.println("Escriba un cadena de texto: "); 
        texto = teclado.nextLine().toCharArray();
        
        execute(texto);
    }
}


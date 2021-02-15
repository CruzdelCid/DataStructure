import java.util.Scanner;


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
        System.out.println("Ingrese una cadena de texto: ");
        texto = teclado.nextLine().toCharArray();

        execute(texto);
    }
}

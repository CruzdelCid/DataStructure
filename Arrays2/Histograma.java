import java.util.Scanner;


public class Histograma {
    static Scanner teclado = new Scanner(System.in); 
    static char[] texto; 
    static char[] letrasMa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
                              'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
    static char[] letrasMi = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                              'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};                      
    static int[][] contador = new int[26][2];  


    static void contar(){
        for(int i = 0; i < 26; i++){
            contador[i][1] = i;
        }

        for(int i = 0; i < texto.length; i++){
            for(int j = 0; j < letrasMa.length; j++){
                if(texto[i] == letrasMa[j]){
                    contador[j][0]++; 
                    break; 
                }
                else if(texto[i] == letrasMi[j]){
                    contador[j][0]++; 
                    break;    
                }
            }
        }
    }

    static void ranking(){
        int n = contador.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (contador[j][0] > contador[j+1][0]) 
                { 
                    int temp = contador[j][0];
                    int temp1 = contador[j][1]; 

                    contador[j][0] = contador[j+1][0];
                    contador[j][1] = contador[j+1][1];

                    contador[j+1][0] = temp;
                    contador[j+1][1] = temp1; 
                }
            }    
        }
    }

    static void printHistograma(){
        System.out.println("\n\nHISTOGRAMA"); 
        for(int i = 25; i > 15; i = i - 1){
            System.out.println(letrasMa[contador[i][1]] + "    " + contador[i][0] + " " + histo(contador[i][0]));
        }
    }

    static String histo(int n){
        String result = ""; 
        for(int i = 0; i < n; i++){
            result = result + '*'; 
        }
        return result; 
    }

    static int[][] execution(char[] entrada){
        
        texto = entrada; 

        contar(); 

        ranking(); 
        
        printHistograma();

        return contador; 
    }

    public static void main(String[] arg) {
        System.out.println("Ingrese una cadena de texto: ");
        texto = teclado.nextLine().toCharArray();

        execution(texto); 
    }
}

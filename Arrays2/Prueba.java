import java.util.Scanner;

public class Prueba {
    static Scanner teclado = new Scanner(System.in); 
    static char[] texto; 
    static char[] letrasMa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
                              'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
    static char[] letrasMi = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                              'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};                      
    static int[][] contador = new int[27][2]; 
    static int[] rank = new int[11]; 


    public static void main(String[] arg) {
        System.out.println("Ingrese una cadena de texto: ");
        texto = teclado.nextLine().toCharArray();
        System.out.println(texto);
        
        for(int i = 0; i < 27; i++){
            contador[i][0] = i;
        }

        for(int i = 0; i < contador.length; i++){
            System.out.println(contador[i][0]); 
        }

        for(int i = 0; i < texto.length; i++){
            for(int j = 0; j < 26; j++){
                if(texto[i] == letrasMa[j]){
                    contador[j][1]++; 
                    break; 
                }
                else if(texto[i] == letrasMi[j]){
                    contador[j][1]++; 
                    break;    
                }
            }
        }
/*
        for(int i = 0; i < 26; i++){
            System.out.println(letrasMa[i] + " " + contador[i]);
        }
*/
        
        //int position = 0; 
/*
        for(int i = 0; i < 26; i++){
            int count = contador[i]; 
            //boolean saveP = true; 

            for(int j = 9; j >= 0; j--){
                if(count >= contador[rank[j]]){
                    int temp = rank[j];
                    rank[j] = i; 
                    rank[j+1] = temp; 
                    if (saveP == true){
                        position++; 
                        saveP = false; 
                    }
                }
                else if(j == position && count > contador[rank[position+1]]){
                    rank[j+1] = i; 
                    if (saveP){
                        position++; 
                        saveP = false; 
                    }
                }
            }
        }
*/
/*
        int n = 27; 
        System.out.println(n);
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (contador[j][1] > contador[j+1][1]) 
                { 
                    int temp = contador[j][1]; 
                    int temp2 = contador[j][0];
                    contador[j][1] = contador[j+1][1]; 
                    contador[j][0] = contador[j+1][0]; 
                    contador[j+1][1] = temp; 
                    contador[j+1][0] = temp2;
                }
            }
        }
*/

        int n = contador.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (contador[j][1] > contador[j+1][1]) 
                { 
                    int temp = contador[j][1]; 
                    int temp2 = contador[j][0]; 

                    contador[j][1] = contador[j+1][1];
                    contador[j][0] = contador[j+1][0]; 

                    contador[j+1][1] = temp; 
                    contador[j+1][0] = temp2; 
                }
            }    
        } 
            
        
        for(int i = 0; i < 26; i++){
            System.out.println(letrasMa[contador[i][0]] + " " + contador[i][1]);
        }
    }
}

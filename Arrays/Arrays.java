import java.util.Scanner;

public class Arrays {
    static Scanner teclado = new Scanner(System.in); 
    static double[] debitos = new double[10];
    static double[] creditos = new double[5]; 
    static int conteo = 0;

    //Función para eliminar el límite de de débitos o créditos ingresados
    //Al perder la referencia del array anterior el resposable de liberar el espacio de memoria es el Garbage Collector
    public static double[] nuevoArray(double[] original){
        double[] nuevo = new double[original.length+1]; 
        for (int i = 0; i < original.length; i++){
            nuevo[i] = original[i]; 
        } 
        return nuevo; 
    }

    public static void debito(){
        int i;
        for(i = 0; i < debitos.length; i++){
            if(debitos[i] == 0.0){
                System.out.println("Inserte el nuevo débito: ");
                debitos[i] = teclado.nextDouble();
                conteo++; 
                break; 
            }
        }
        if(i >= debitos.length){
            System.out.println("No es posible insertar más débitos.");
        }
    }

    public static void credito(){
        int i;
        for(i = 0; i < creditos.length; i++){
            if(creditos[i] == 0.0){
                System.out.println("Inserte el nuevo crédito: ");
                creditos[i] = teclado.nextDouble();
                conteo++; 
                break; 
            }
        }
        if(i >= creditos.length){
            System.out.println("No es posible insertar más créditos.");
        }
    }

    public static void printDeb(){
        for(int i = 0; i < debitos.length; i++){
            if(debitos[i] == 0.0){
                break; 
            }
            else{
                System.out.println("Q" + debitos[i]);
            }
        }
    }
    
    public static void printCre(){
        for(int i = 0; i < creditos.length; i++){
            if(creditos[i] == 0.0){
                break; 
            }
            else{
                System.out.println("         Q" + creditos[i]);
            }
        } 
    }

    static double totalDeb(){
        double total = 0; 
        for(int i = 0; i < debitos.length; i++){
            total += debitos[i]; 
            if(debitos[i] == 0.0){
                break;
            }
        }
        return total; 
    }
    static double totalCre(){
        double total = 0; 
        for(int i = 0; i < creditos.length; i++){
            total += creditos[i]; 
            if(creditos[i] == 0.0){
                break;
            }
        }
        return total; 
    }

    static double promedioDeb(){
        double resultado = 0; 
        int i;
        boolean bandera = true;
        for(i = 0; i < debitos.length; i++){
            resultado = resultado + debitos[i];
            if(debitos[i] == 0.0){
                resultado = resultado/i;  
                bandera = false; 
                break;
            }
            
        }
        if(bandera == true){
            resultado = resultado/debitos.length;  
        }
        return resultado;
    }

    static double promedioCre(){
        double resultado = 0; 
        int i;
        boolean bandera = true;
        for(i = 0; i < creditos.length; i++){
            resultado = resultado + creditos[i];
            if(creditos[i] == 0.0){
                resultado = resultado/i;  
                bandera = false; 
                break;
            }
            
        }
        if(bandera == true){
            resultado = resultado/creditos.length;  
        }
        return resultado;
    }

    static double maxDeb(){
        double max = 0; 
        for(int i = 0; i < debitos.length; i++){
            if(max < debitos[i]){
                max = debitos[i]; 
            }
        }
        return max; 
    }

    static void transacciones(){
        System.out.println("        ");
        System.out.println("Débitos   Créditos");
        printDeb(); 
        printCre();
        System.out.println("Q" + totalDeb() + "  " + "Q" + totalCre());
        System.out.println("Su saldo es: " + (totalDeb()-totalCre()));
    }
    static void eliminarCre(double n){
        for(int i = 0; i < creditos.length; i++){
            if (creditos[i] == n){ 
                creditos[i] = 0; 
                int j; 
                for(j = i; j  < creditos.length-1; j++){
                    creditos[j] = creditos[j+1]; 
                }
                creditos[j] = 0.0;
                break; 
            }
            else if(i == creditos.length){
                System.out.println("El crédito que quiere elminar no existe.");
            }
        }
    }

    public static void main(String[] arg) {        
        int option = 0; 

        while(option != 12) {
            System.out.println("\n");
            System.out.println("MENU");
            System.out.println("1. Insertar un débito");
            System.out.println("2. Insertar un crédito");
            System.out.println("3. Mostrar total de débito");
            System.out.println("4. Mostrar total de crédito");
            System.out.println("5. Mostrar SALDO");
            System.out.println("6. Mostrar promedio de débitos");
            System.out.println("7. Mostrar promedio de créditos");
            System.out.println("8. Mostrar el débito más grande");
            System.out.println("9. Mostrar conteo durante ejecución");
            System.out.println("10. Mostrar todas las transacciones");
            System.out.println("11. Eliminar");
            System.out.println("12. Salir");
            System.out.println("\nEscriba el número de la opción que desee: ");
            option =  teclado.nextInt(); 
            teclado.nextLine(); 

            switch(option){
                case 1:
                    System.out.println("");
                    debito(); 
                    printDeb(); 
                    break;
                case 2:
                    System.out.println("");
                    credito(); 
                    printCre(); 
                    break;
                case 3:
                    System.out.println("\nEl total de débitos es: Q" + totalDeb());
                    break;
                case 4:
                    System.out.println("\nEl total de créditos es: Q" + totalCre());
                    break;
                case 5:
                    System.out.println("\nSu saldo es: " + (totalDeb()-totalCre()));
                    break;
                case 6:
                    System.out.println("\nEl promedio de los débitos es: Q" + promedioDeb());
                    break;
                case 7:
                    System.out.println("\nEl promedio de los débitos es: Q" + promedioCre());
                    break;
                case 8:
                    System.out.println("\nEl débito más grande es de Q" + maxDeb());
                    break;
                case 9:
                    System.out.println("\nEl coteo de las operaciones es igual a: " + conteo);
                    break;
                case 10:
                    transacciones(); 
                    break; 
                case 11:
                    System.out.println("Escriba el valor del crédito a eliminar: ");
                    double n = teclado.nextDouble(); 
                    eliminarCre(n);
                    System.out.println("");
                    System.out.println("El total de débitos es: Q" + totalDeb());
                    System.out.println("El total de créditos es: Q" + totalCre());
                    System.out.println("Su saldo es: " + (totalDeb()-totalCre()));
                    System.out.println("El promedio de los débitos es: Q" + promedioDeb());
                    System.out.println("El promedio de los débitos es: Q" + promedioCre());
                    System.out.println("El débito más grande es de Q" + maxDeb());
                    transacciones(); 
                    System.out.println("Operaciones débito/crédito durante la ejecución" + conteo);
                    break; 
                case 12:
                    System.out.println("Gracias por usar el programa");
                    System.exit(0); 
                    break;
                 default:
                    System.out.println("Solo puede seleccionar opciones entre 1 y 11 ");
                    break;
            }
        }
    }
}
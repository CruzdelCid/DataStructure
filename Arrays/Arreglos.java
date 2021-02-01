public class Arreglos {
    
    public static void main(String[] arg) {
        double[] numeros = new double[4]; 
        double[] n = {1.1, 2.2, 3.3, 4.4}; 

        System.out.println("MENU");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == 0.0){
                numeros[i] = n[i];
                break; 
            } 
        }

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

    }
}

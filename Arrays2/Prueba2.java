public class Prueba2 {

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


    public static void main(String[] arg) {
        System.out.println(palindromo("amar")); 

    }
}

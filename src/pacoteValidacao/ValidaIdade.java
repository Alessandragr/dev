package pacoteValidacao;

public class ValidaIdade {
    public static boolean isIdade(int value){
        boolean valido = true;
        if(value <= 0 ){
            valido = false;
        }
        return valido;
    }
}

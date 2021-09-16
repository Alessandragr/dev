package pacoteValidacao;

public class ValidaIdade {
    public static boolean isIdade(String value){
        boolean valido = true;
        if(value.length() < 0 ){
            valido = false;
        }
        return valido;
    }
}

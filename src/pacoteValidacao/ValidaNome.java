package pacoteValidacao;

public class ValidaNome {
    public static boolean isNome(String value){
        boolean valido = true;
        if(value.length() < 3){
            valido = false;
        }
        return valido;
    }
}

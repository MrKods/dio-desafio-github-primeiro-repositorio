public class AnatomiaDasClasses3Part2 { 

    public static void main (String[] args) {
        
        String primeiroNome ="Kelvin";
        
        String segundoNome ="Oliveira";
        
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);
    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
 }


}

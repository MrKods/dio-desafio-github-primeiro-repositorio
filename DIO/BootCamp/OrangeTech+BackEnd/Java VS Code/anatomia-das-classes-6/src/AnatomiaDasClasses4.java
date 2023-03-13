public class AnatomiaDasClasses4 {
    public static void main(String[] args) {
        //Java Beans 
            
            //Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere através de convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.

        //Variáveis

            //Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:

                //Uma variável deve ser clara, sem abreviações ou definição sem sentido;
                //Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
                //Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

        //Não recomendado fazer:
        double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
        String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
        String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não  
        
        //Recomendado fazer
        double salarioMedio=1500.23;
        String email ="aluno@escola.com";
        String [] emails = {"aluno@escola.com","professor@escola.com"}
        String meuNome = "JOSEPH" 

        //Métodos
        
            //Exemplos sugeridos para nomenclatura de métodos:
            
                //somar(int n1, int n2){}

                //abrirConexao(){}

                //concluirProcessamento() {}

                //findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

                //calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
    }
    
}
 

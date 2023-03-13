public class AnatomiaDasClasses2 {
    public static void main(String[] args) {
        
    }
}
    // Aula anotomia das classe 2

        //  Padrão de nomenclatura

            // Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:

            // Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:

            // Calculadora.java, CalculadoraCientifica.java


            // Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

            // arquivo CalculadoraCientifica.java

            // public class CalculadoraCientifica {
            
            // Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".
            
                // Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:
            
                final String BR = "Brasil";

                BR = "Brazil";//errado 
                    
                    //errado pois não posso mudar o valor da variavel que tem se vem em toda maisusculo pois se pre su poe que e uma variavel final, não se pode modificar.

                Int ano = 2021;

                ano = 2022;//pode mudar pois esta em letra minuscula


                //double PI = 3.14
                //int ESTADOS_BRASILEIRO = 27
                //int ANO_2000 = 2000
                
                
                
                    //Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem.
                
                
                //Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
                
                //Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
                
                //Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
                
                //Não pode conter espaços;
                
                //Não podemos usar palavras-chave da linguagem;
                
                //O nome deve ser único dentro de um escopo.


                // Declação inválida de variáveis

                    
                    int numero&um = 1; //Os únicos símbolos permitidos são _ e $
                    int 1numero = 1;    //Uma variável não pode começar com númerico
                    int numero um = 1; //Não pode ter espaço no nome da variável
                    int long = 1; //long faz parte das palavras reservadas da linguagem
                    
                    // Declaração válida de veriáveis
                    int numero$um = 1;
                    int numero1 = 1;
                    int numeroum = 1;
                    int longo = 1;

                    




// Tipos de variáveis
/*
    String -> Armazena texto
    char -> Armazena uma única letra
    int -> Armazena números inteiros
    float -> números decimais
    double -> números decimais. Maior precisão 
    Toda variável Deve começar com letra minúscula
    Não pode haver espaço no nome da variável
    nomeAluno
 */


 public class Exemplo01{

    public static void main(String[] args) {
        
        String nome = "Felipe Eça";
        int idade = 16;
        boolean chuva = true; // Booleana = true or false
        char letra = 'G'; // Todo char deve estar com aspas simples ''
        double salario = 14999.99;
        float altura = (float) 1.77;

        System.out.println("Meu nome é: "+nome);
        System.out.println("Minha idade é: "+ idade);
        System.out.println("Está chovendo? "+ chuva);
        System.out.println("A inicial do meu nome é: "+letra);
        System.out.println("O meu salário é: "+salario);
        System.out.println("Minha altura é: "+altura+" metros");


    }
    
 }
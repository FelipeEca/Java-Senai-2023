public class Exemplo02 {
    
    public static final int TAXA = 10;
    public static final double PI = 3.14;


    public static void main(String[] args) {

        System.out.println("A taxa da loja é de: " +TAXA+"%");
        System.out.println("PI vale: " + PI);
        
    }

    // public -> qualquer linha consegue acessar esse valor
    // static -> Essa constante é campartilhada entre todas as classes do meu programa
    // final -> Não posso alterar o valor

}

/*
 * Contante -> Variável em Java em que não posso alterar o valor 
 * usamos a palavra final chave
 */
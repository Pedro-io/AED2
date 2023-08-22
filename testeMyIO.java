public class testeMyIO {
    
    //Arquivo ExemploMyIO.java

    public static void main (String[] args){
    String str = MyIO.readString("Entre com uma palavra: ");
    int inteiro = MyIO.readInt("Entre com um inteiro: ");
    double real = MyIO.readDouble("Entre com um real: ");
    char caractere = MyIO.readChar("Entre com um caractere: ");
    MyIO.println("Sua string: " + str);
    MyIO.println("Seu inteiro: " + inteiro);
    MyIO.println("Seu real: " + real);
    MyIO.println("Seu caractere: " + caractere);
    teste2();
    teste3();
    }
    

    public static void teste2 ()
    {
        MyIO.println("ouououo");
    }
    
    public static void teste3()
    {
        int i = MyIO.readInt("Entre com um inteiro: ");
        MyIO.println(+i);
    }
}

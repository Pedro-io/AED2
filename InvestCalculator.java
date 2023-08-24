

public class InvestCalculator {
    
    // Variaveis de instância 
    private static int periodo;
    private static float valor;
    private static float taxa;
    private static double aliquota;
    public static void main(String[] args) {
        
        MyIO.println("-------QUESTAO 1--------");
        questao1();
        MyIO.println("-------QUESTAO 2--------");
        questao2();
        MyIO.println("-------QUESTAO 3--------");
        questao3();

    }

    public static void questao1() {
        periodo = MyIO.readInt("Entre com o periodo de tempo em dias: ");
        

        if (periodo <= 180) {
            aliquota = 0.225;
        } else if (periodo <= 360) {
            aliquota = 0.2;
        } else if (periodo <= 720) {
            aliquota = 0.175;
        } else {
            aliquota = 0.15;
        }

        MyIO.println("Alíquota de Imposto de Renda: " + (aliquota * 100) + "%");
    }

    public static void questao2() {
        valor = MyIO.readFloat("Indique o valor investido: ");
        taxa = MyIO.readFloat("Indique a taxa de juros diaria(percentual):");
        periodo = MyIO.readInt("Indique o tempo do investimento(em dias): ");
        double montante = valor * Math.pow(1 + (taxa / 100), periodo);

        MyIO.println("Montante após investimento: " + montante);
    }
    public static void questao3() {
       
        valor = MyIO.readFloat("Indique o valor investido: ");
        taxa = MyIO.readFloat("Indique a taxa de juros diaria(percentual):");
        periodo = MyIO.readInt("Indique o tempo do investimento(em dias): ");
         if (periodo <= 180) {
            aliquota = 0.225;
        } else if (periodo <= 360) {
            aliquota = 0.2;
        } else if (periodo <= 720) {
            aliquota = 0.175;
        } else {
            aliquota = 0.15;
        }
        double lucro = ((valor * (Math.pow(1 + (taxa / 100), periodo))) - valor) * (1 - aliquota);
        MyIO.println("Lucro ap0s investimento: " + lucro);
    }
}

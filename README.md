# AED2

public class Lista1 {

    public static void main(String[] args) {
        MyIO.println("-------QUESTAO 1--------");
        Questao1();
        MyIO.println("-------QUESTAO 2--------");
        Questao2();
        MyIO.println("-------QUESTAO 3--------");
    }

    public static void Questao1()
    {
            /*
        Questão 01
            Faça um programa em Java que receba como entrada o período de tempo, em dias, de um investido
            financeiro sujeito a tributação. O programa deverá informar a alíquota de imposto de renda a ser paga,
            com base na seguinte tabela:
                                            Tempo Alíquota
                                        de 0 a 180 dias 22,5%
                                        de 181 a 360 dias 20%
                                        de 361 a 720 dias 17,5%
                                        mais de 720 dias 15% 
            */   


            int aliquota = MyIO.readInt("Entre com o periodo de tempo em dias: ");

            if ((0<= aliquota)&&(aliquota <= 180)) {
                MyIO.println("22,5%");
                
            }


            
            if ((181<= aliquota)&&(aliquota <= 360)) {
                MyIO.println("20%");
            }

            
            if ((361<= aliquota)&&(aliquota <= 720)) {
                 MyIO.println("17,5%");
            }

            
            if (aliquota>720) {
                MyIO.println("15%");
            }

    
    }


    public static void Questao2()
    {
        float valor = MyIO.readFloat("Indique o valor investido: ");
        float taxa = MyIO.readFloat("Indique a taxa de juros diaria(percentual):");
        int tempo = MyIO.readInt("Indique o tempo do investimento( em dias): ");
        double montante = 0;
        montante =  (Math.pow(1 + (taxa/100), tempo)) * valor ;

        MyIO.println(montante);
    }

    public static void Questao3()
    {

        if ((0<= tempo)&&(tempo <= 180)) {
               aliquota = 22,5;
                
            }


            
            if ((181<= tempo)&&(tempo <= 360)) {
               aliquota = 20%;
            }

            
            if ((361<= tempo)&&(tempo <= 720)) {
                aliquota = 17,5;
            }

            
            if (tempo>720) {
               aliquota = 15%;
            }

        float valor = MyIO.readFloat("Indique o valor investido: ");
        float taxa = MyIO.readFloat("Indique a taxa de juros diaria(percentual):");
        int tempo = MyIO.readInt("Indique o tempo do investimento( em dias): ");
        double lucro = (( valor * (Math.pow(1+ (taxa/100), tempo)) - valor ) *  ( 1- aliquota));
        MyIO.println(lucro);
    }
     
}

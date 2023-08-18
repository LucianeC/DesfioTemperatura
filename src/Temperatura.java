public class Temperatura {
    //    Escreva um programa que converta uma temperatura em graus Celsius
//    para Fahrenheit. Utilize variáveis para representar os valores
//    das temperaturas e imprima no console
//    o valor convertido de Celsius para Fahrenheit.
    public static void main(String[] args) {
        double temperatura = 27.4;
        double fahrenheit = (temperatura * 1.8) + 32;
        String resultado = " o valor convertido de Celsius para Fahrenheit é " + fahrenheit;
        System.out.println(resultado);


        double temperatureC = 27.5;
        double temperatureF = ((temperatureC * 1.8) + 32);
        int temperatureCtoF = (int)temperatureF;

        String texto = """
                      
                            
                A temperatura em celsius é %.1f ºC,
                A temperatura em Fahrenheit é %.1f ºF.
               
                
                """.formatted(temperatureC,temperatureF);

        System.out.println(texto);

    }
}
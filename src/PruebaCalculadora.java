public class PruebaCalculadora {

    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora();

        // Caso de prueba 1
        double resultado1 = miCalculadora.multiplicar(80, 3);
        System.out.println("El resultado de multiplicar 80 por 3 da " + resultado1);

        // Caso de prueba 2
        double resultado2 = miCalculadora.sumar(150, 180) / 3;
        System.out.println("El resultado de sumar 150 y 180, dividido por 3, da " + resultado2);

        // Caso de prueba 3
        double resultado3 = miCalculadora.restar(90, 50) * 15;
        System.out.println("El resultado de restar 90 y 50, multiplicado por 15, no da " + resultado3);

        // Caso de prueba 4
        double resultado4 = miCalculadora.sumar(70, 40) * 25;
        System.out.println("El resultado de sumar 70 y 40, multiplicado por 25, no da " + resultado4);
    }
}

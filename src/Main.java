public class Main {
    public static void main(String[] args) {



        //

        Gallina gallina1 = new Gallina("ave", 2, "hembra","cafe","puntudo" );



        System.out.println("la especie es "+gallina1.getEspecie());
        System.out.println("el numero de pies es "+gallina1.getNumeroPies());
        System.out.println("el genero es "+gallina1.getGenero());
        System.out.println("color es "+gallina1.getColor());
        System.out.println("la forma del pico es "+gallina1.getFormaPico());



        gallina1.volar();
        gallina1.calcularCantidadHuevos(2,6);



    }



}
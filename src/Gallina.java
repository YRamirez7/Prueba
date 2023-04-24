public class Gallina extends Animal{

    private String Color;

    private String formaPico;

    public Gallina(String especie, int numeroPies, String genero, String color, String formaPico) {
        super(especie, numeroPies, genero);
        Color = color;
        this.formaPico = formaPico;
    }

    public void volar(){

       System.out.println("la gallina sta volando");
    }

    public void calcularCantidadHuevos(int cantidadAgua, int cantidadComida){


        System.out.println("la cantidad de huevos a pones es "  +cantidadComida*cantidadAgua);

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getFormaPico() {
        return formaPico;
    }

    public void setFormaPico(String formaPico) {
        this.formaPico = formaPico;
    }
}

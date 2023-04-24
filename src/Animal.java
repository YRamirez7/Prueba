public class Animal {

    private String especie;


    private int numeroPies;

    private String genero;

    public Animal(String especie, int numeroPies, String genero) {
        this.especie = especie;
        this.numeroPies = numeroPies;
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumeroPies() {
        return numeroPies;
    }

    public void setNumeroPies(int numeroPies) {
        this.numeroPies = numeroPies;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

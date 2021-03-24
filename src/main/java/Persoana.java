import java.util.Objects;

/*
Definiti clasa Persoana cu campul nume de tip String, si o metoda toString() care va returna numele persoanei. Clasa va mai contine:
- Un constructor fara parametri
- Un constructor ce va initializa numele.
 */
public class Persoana {
    private String nume;

    public Persoana(){

    }

    public Persoana(String nume){
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

import java.util.Objects;

public final class Profesor extends Persoana {
    private String materia;

    public Profesor(){

    }

    public Profesor(String nume, String materia) {
        super(nume);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(materia, profesor.materia);
    }

    public String toStringUsingBaseClass() {
        return super.toString() + ", materia= " + '\'' + materia + '\'';
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + super.getNume() + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}

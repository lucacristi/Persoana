import java.util.Objects;

public class Student extends Persoana implements Comparable<Student>{
    private int nota;

    public Student(){

    }

    public Student(String nume, int nota){
        super(nume);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return nota == student.nota;
    }

    public String toStringUsingBaseClass() {
        return super.toString() + ", materia= " + '\'' + nota + '\'';
    }

    @Override
    public int compareTo(Student o) {
        return super.getNume().compareTo(o.getNume());
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + super.getNume() + '\'' +
                ", nota=" + nota +
                '}';
    }
}

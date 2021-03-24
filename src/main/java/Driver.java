import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul de persoane");
        int nrPersoane = new Scanner(System.in).nextInt();

        Persoana[] persoane = new Persoana[nrPersoane];

        for(int i = 0; i < nrPersoane; i++){
            System.out.println("Alege un tip:\n1.Persoana\n2.Profesor\n3.Student");
            int tipPersoana = new Scanner(System.in).nextInt();

            System.out.println("Introduceti numele");
            String nume = new Scanner(System.in).nextLine();

            switch (tipPersoana){
                case 1:{
                    persoane[i] = new Persoana(nume);
                    break;
                }
                case 2:{
                    System.out.println("Introduceti numele materiei");
                    String materie = new Scanner(System.in).nextLine();
                    persoane[i] = new Profesor(nume,materie);
                    break;
                }
                case 3:{
                    System.out.println("Introduceti nota");
                    int nota = new Scanner(System.in).nextInt();
                    persoane[i] = new Student(nume,nota);
                    break;
                }
            }
        }


        for(Persoana p: persoane){
            System.out.println(p);
        }
    }
}

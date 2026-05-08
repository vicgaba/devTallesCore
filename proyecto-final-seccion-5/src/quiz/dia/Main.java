package quiz.dia;

public class Main {

    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;
        switch (hoy) {
            case LUNES:
                System.out.println("Inicio de semana.");
                break;
            case VIERNES:
                System.out.println("Fin de semana cercano.");
                break;
            case MIERCOLES:
                System.out.println("Mitad de semana.");
                break;
            default:
                System.out.println("Otro día.");
        }
    }
}
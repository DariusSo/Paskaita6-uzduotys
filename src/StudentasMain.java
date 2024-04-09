import java.util.Random;

public class StudentasMain {
    public static void main(String[] args) {
        Studentas mantas = new Studentas("Mantas", "Mazeika", 8586456);
        Random random = new Random();
        for (int i = 0; i < 8; i++){
            mantas.pridekPazimi(random.nextInt(1, 10));
        }
        Studentas jonas = new Studentas("Jonas", "Jonaitis", 8586457);
        for (int i = 0; i < 8; i++){
            jonas.pridekPazimi(random.nextInt(1, 10));
        }
        Studentas giedrius = new Studentas("Giedrius", "Giedrelis", 8586458);
        for (int i = 0; i < 8; i++){
            giedrius.pridekPazimi(random.nextInt(1, 10));
        }
        System.out.println(mantas.getVardas());
        System.out.println("Pazymiai: " + mantas.getPazymiai());
        System.out.println("Pazymiu skaicius: " + mantas.pazymiuKiekis());
        System.out.println("Zemiausias pazimys: " + mantas.zemiausias());
        System.out.println("Auksciausias pazimys: " + mantas.auksciausias());
        System.out.println("Mediana: " + mantas.mediana());
        System.out.printf("Vidurkis : %.2f", mantas.vidurkis());
        System.out.println();
        System.out.println(jonas.getVardas());
        System.out.println("Pazymiai: " + jonas.getPazymiai());
        System.out.println("Pazymiu skaicius: " + jonas.pazymiuKiekis());
        System.out.println("Zemiausias pazimys: " + jonas.zemiausias());
        System.out.println("Auksciausias pazimys: " + jonas.auksciausias());
        System.out.println("Mediana: " + jonas.mediana());
        System.out.printf("Vidurkis : %.2f", jonas.vidurkis());
    }
}

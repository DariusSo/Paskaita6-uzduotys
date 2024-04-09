import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Studentas {
    private String vardas;
    private String pavarde;
    private int studentoID;
    private List<Integer> pazymiai = new ArrayList<>();

    public Studentas(String vardas, String pavarde, int studentoID) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.studentoID = studentoID;
        this.pazymiai = pazymiai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getStudentoID() {
        return studentoID;
    }

    public List<Integer> getPazymiai() {
        return pazymiai;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setStudentoID(int studentoID) {
        this.studentoID = studentoID;
    }

    public void setPazymiai(List<Integer> pazymiai) {
        this.pazymiai = pazymiai;
    }

    public void pridekPazimi(int pazimys) {
        pazymiai.add(pazimys);
    }

    public double vidurkis() {
        double vidurkis = 0;
        for (int i = 0; i < pazymiai.size(); i++) {
            vidurkis = vidurkis + pazymiai.get(i);
        }
        vidurkis = vidurkis / pazymiai.size();
        return vidurkis;
    }

    public int mediana() {
        int mediana = pazymiai.size() / 2;
        return pazymiai.get(mediana);
    }

    public int zemiausias() {
        int zemiausias = pazymiai.get(0);
        for (int i = 1; i < pazymiai.size(); i++) {
            if (zemiausias > pazymiai.get(i))
                zemiausias = pazymiai.get(i);
        }
        return zemiausias;
    }
    public int auksciausias() {
        int auksciausias = pazymiai.get(0);
        for (int i = 1; i < pazymiai.size(); i++) {
            if (auksciausias < pazymiai.get(i))
                auksciausias = pazymiai.get(i);
        }
        return auksciausias;
    }
    public int pazymiuKiekis(){
        return pazymiai.size();
    }
}

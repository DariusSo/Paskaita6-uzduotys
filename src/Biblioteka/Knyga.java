package Biblioteka;

public class Knyga {

    private String išleidimoMetai;
    private String autorius;
    private String pavadinimas;

    public Knyga(String išleidimoMetai, String autorius, String pavadinimas) {
        this.išleidimoMetai = išleidimoMetai;
        this.autorius = autorius;
        this.pavadinimas = pavadinimas;
    }

    public String getIšleidimoMetai() {
        return išleidimoMetai;
    }

    public String setIšleidimoMetai(int išleidimoMetai) {
        return this.išleidimoMetai;
    }

    public void setAutorius(String autorius) {
        this.autorius = autorius;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAutorius() {
        return autorius;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
}

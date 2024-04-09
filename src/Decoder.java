public class Decoder {
    private String plainText;
    private String cypher;

    public Decoder(String cypher) {
        this.cypher = cypher;
    }

    public String getPlainText() {
        return plainText;
    }

    public String getCypher() {
        return cypher;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void setCypher(String cypher) {
        this.cypher = cypher;
    }

    public String atkodavimas(){
        String a = "";
        for (int i = 2; i < cypher.length() - 2; i+=2){
            a = a + cypher.charAt(i);
        }
        plainText = a;
        return plainText;
    }
}

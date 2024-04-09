import java.util.Random;

public class Encoder {
    private String plainText;
    private String cypher;

    public Encoder(String plainText) {
        this.plainText = plainText;
    }

    public String getCypher() {
        return cypher;
    }

    public void setCypher(String cypher) {
        this.cypher = cypher;
    }

    private char randomChar(){
        Random random = new Random();
        char randomChar = (char) random.nextInt(300, 350);
        return randomChar;
    }
    public char getRandomChar(){
        return this.randomChar();
    }
    public String kodavimas(){
        String a = String.valueOf(getRandomChar()) + String.valueOf(getRandomChar());
        for (int i = 0; i < plainText.length(); i++){
            a = a + plainText.charAt(i) + getRandomChar();
        }
        cypher = a + getRandomChar();
        return cypher;
    }
}

public class MyEnigma {
    public static void main(String[] args) {
        IOManager slaptaZinute = new IOManager();
        slaptaZinute.skenuok();
        slaptaZinute.zinute();
        System.out.println("Jusu slapta zinute yra: " + slaptaZinute.getInputMessage());
        if (slaptaZinute.getAction() == 1){
            Encoder uzkoduok = new Encoder(slaptaZinute.getInputMessage());
            uzkoduok.kodavimas();
            System.out.println("Jusu uzkoduota zinute yra: " + uzkoduok.getCypher());
        } else if (slaptaZinute.getAction() == 2) {
            Decoder test1 = new Decoder(slaptaZinute.getInputMessage());
            test1.atkodavimas();
            System.out.println("Jusu atkoduota zinute yra: " + test1.getPlainText());
        }else {
            System.out.println("Kazka blogai ivedete.");
        }



    }
}

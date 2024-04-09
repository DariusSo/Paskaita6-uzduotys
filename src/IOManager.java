import java.util.Scanner;

public class IOManager {
    private int action;
    private String inputMessage;

    public int getAction() {
        return action;
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public int skenuok(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 1 jeigu norite uzkoduoti texta, 2 - jeigu norite atkoduoti: ");
        if (Integer.parseInt(scanner.nextLine()) != 1 || Integer.parseInt(scanner.nextLine()) != 2){
            System.out.println("Pasirinkot bloga skaiciu");
            System.exit(0);
        }
        action = Integer.parseInt(scanner.nextLine());
        return action;
    }
    public String zinute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zinute kuria norite uzkoduoti: ");
        inputMessage = scanner.nextLine();
        return inputMessage;
    }
}

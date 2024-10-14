import javax.sound.midi.SysexMessage;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale localeUS = Locale.forLanguageTag("en-US");

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(localeUS);

        String messageProductOne = String.format("%s, which price is %s", product1, numberFormatUS.format(price1));
        String messageProductTwo = String.format("%s, which price is %s", product2, numberFormatUS.format(price2));

        String messageRecord = String.format("%s years old, code %s and gender: %s", age, code, gender);

        String messageMeasure = String.format("Measure with eight decimal places: %s", numberFormatUS.format(measure));

//        System.out.println("Product: ");
//        System.out.println(messageProductOne);
//        System.out.println(messageProductTwo);
//
//        System.out.println(messageRecord);
//        System.out.println(messageMeasure);
//
        Scanner sc = new Scanner(System.in);

        System.out.print("Me diga sua idade: ");
        int yourAge = sc.nextInt();

        System.out.print("Me diga sua profissão: ");
        String yourProfession = sc.next();

        sc.nextLine();

        System.out.print("Me diga seu nome: ");
        String yourName = sc.nextLine();

        System.out.println("Idade: " + yourAge);
        System.out.println("Profissão: " + yourProfession);
        System.out.println("Nome: " + yourName);

        sc.close();

    }

}







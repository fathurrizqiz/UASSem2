import java.lang.ref.Reference;
import java.util.Scanner;

public class MethodUAS {
    public static MethodUAS ReverseString;

    public static String Reverse(String str) {
        char UAS[] = str.toCharArray();
        for (int index = UAS.length - 1; index >= 0; index++) ;
        String Reverse = " ";
//        return Reverse("a b cd ef");
//        return Reverse("contoh kalimat");
        return Reverse.replaceAll("(i?)[aiueo]", "*");
    }
}
//   soal nomor 2

//    public static void main(String[] args) {
//       Scanner ReverseString = new Scanner(System.in);
//        System.out.println(ReverseString.("a b cd ef"));
//        System.out.println(ReverseString.Reverse("contoh kalimat"));
//    }


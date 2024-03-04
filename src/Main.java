import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan hava sıcaklığını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını girin (°C): ");
        int sicaklik = scanner.nextInt();

        // Etkinlik önerisi
        String etkinlik = "";
        if (sicaklik < 5) {
            etkinlik = "Kayak yapmayı öneririm.";
        } else if (sicaklik >= 5 && sicaklik < 15) {
            etkinlik = "Sinemaya gitmeyi öneririm.";
        } else if (sicaklik >= 15 && sicaklik < 25) {
            etkinlik = "Piknik yapmayı öneririm.";
        } else {
            etkinlik = "Yüzmeye gitmeyi öneririm.";
        }

        // Etkinlik önerisini ekrana yazdır
        System.out.println("Bugün hava sıcaklığına göre önerim: " + etkinlik);
    }
}

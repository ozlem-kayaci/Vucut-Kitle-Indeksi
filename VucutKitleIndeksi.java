import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        // Vücut Kitle İndeksi (BMI) hesaplayan program
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Boyunuzu cm cinsinden giriniz: ");
        int boyCm = scanner.nextInt();
        if (boyCm <= 0) {
            System.out.println("Boy değeri geçersiz! Lütfen pozitif bir değer girin.");
            return; 
        }
        float boy = boyCm / 100.0f;
        
        System.out.print("Kilonuzu giriniz: ");
        float kg = scanner.nextFloat();
        if (kg <= 0) {
            System.out.println("Kilo değeri geçersiz! Lütfen pozitif bir değer girin.");
            return;
        }
        
        float bmi = kg / (boy * boy);
        
        System.out.println("Vücut kitle indeksiniz: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("Normalden zayıfsınız.");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normalsiniz.");
        } 
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Kilolusunuz.");
        } 
        else {
            System.out.println("Obezsiniz.");
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ödev Sorusu: Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        // Formüller: Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢 , 𝑢 = (a+b+c) / 2 , Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        int kenar1, kenar2, kenar3, u;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenar Uzunluğunu Giriniz : ");
        kenar1 = input.nextInt();
        System.out.print("İkinci Kenar Uzunluğunu Giriniz : ");
        kenar2 = input.nextInt();
        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz : ");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Alan : " + alan);
    }
}
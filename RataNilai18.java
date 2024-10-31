import java.util.Scanner;

public class RataNilai18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float totalNilai = 0;
        float RataNilai;
        int i = 0;
        int j;
        float nilaiMhs;
        for (j=1;j<=5;j++){
            System.out.print("Nilai ke-" + j + "=");
            nilaiMhs = sc.nextInt();
            totalNilai+=nilaiMhs;

        }
        totalNilai=totalNilai/5;
        System.out.println("Total Nilai: " +totalNilai);
        i++;

        i = 1;
        while (i<=5) {
            totalNilai=0;
            for (j=1;j<=5;j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai=nilaiMhs;
            }
            RataNilai=totalNilai/5;
            System.out.println("Total Nilai: " +RataNilai);
            i++;
        }
        
    }
}
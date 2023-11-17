
import java.util.Scanner;


public class Alan_hesaplama {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String islemler="***islemler***\n"+"1-karenin alanini hesapla\n"+
                          "2-ucgenin alanini hesapla\n"+"3-dairenin alanini hesapla\n"+
                           "4-cikmak icin q'ya basiniz...";
        while(true){
            System.out.println(islemler);
            System.out.println("hangi seklin alanini hesaplamak istersiniz?");
            String sekilturu=scanner.nextLine();
            sekil sekil1=null;
            if(sekilturu.equals("q")){
                System.out.println("uygulamadan cikiliyor...");
                break;
            }
            else if(sekilturu.equals("1")){
                System.out.println("karenin kenari: ");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                sekil1=new kare("kare1", kenar);
                sekil1.alanhesapla();
            }
            else if(sekilturu.equals("2")){
                System.out.println("sirasiyla ucgenin kenarlarını giriniz:");
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int c=scanner.nextInt();
                scanner.nextLine();
                sekil1=new ucgen("ucgen1", a, b, c);
                sekil1.alanhesapla();
            }
            else if(sekilturu.equals("3")){
                System.out.println("dairenin yaricapi:");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                sekil1=new daire("daire1", yaricap);
                sekil1.alanhesapla();
            }
            else{
                System.out.println("gecersiz islem girisi yaptiniz...");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Sarkıcı sarkıcılar = new Sarkıcı();
    public static void SarkıcıGörüntüle(){
        sarkıcılar.SarkıcıGöster();
    }
    public static void SarkıcıEkle(){
        System.out.println("isim girin");
        String isim= scanner.nextLine();
        sarkıcılar.SarkıcıEkle(isim);
    }
    public static void SarkıcıSil(){
        System.out.println("pozisyon girin");
        int pozisyon= scanner.nextInt();
        sarkıcılar.SarkıcıSil(pozisyon);
    }
    public static void SarkıcıGüncelle(){
        System.out.println("isim girin");
        String isim= scanner.nextLine();
        System.out.println("pozisyon girin");
        int pozisyon= scanner.nextInt();
        sarkıcılar.SarkıcıGüncelle(pozisyon, isim);
    }
    public static void SarkıcıAra(){
        System.out.println("isim girin");
        String isim= scanner.nextLine();
        sarkıcılar.SarkıcıAra(isim);
    }
     public static void main(String[] args) {
        
        String islemler="1-Şarkıcı Göster\n"+
                        "2-Şarkıcı Ekle\n"+
                        "3-Şarkıcı Sil\n"+
                        "4-Şarkıcı Güncelle\n"+
                        "5-Şarkıcı Ara\n"+
                        "6-Programı bitir";
            System.out.println(islemler);
         while(true){
            
             String islem;
             System.out.println("Lütfen işlem girin");
             islem=scanner.nextLine();
             
             switch(islem){
                 case "1":
                   SarkıcıGörüntüle();
                   break;
                 case "2":
                  SarkıcıEkle();
                 break;
                 case "3":
                 SarkıcıSil();
                 break;
                 case "4":
                 SarkıcıGüncelle();
                 break;
                 case"5":
                 SarkıcıAra();
                 break;
                 case "6":
                  break;
             }

         }
                
    }
}

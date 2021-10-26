import java.util.ArrayList;
public class Sarkıcı{
    private ArrayList<String> sarkıcı_lsitesi= new ArrayList<String>();
    public void SarkıcıGöster(){
        System.out.println(" Şarkıcılar listesinde " + sarkıcı_lsitesi.size() + " kadar şarkıcı var ");
        for(int i=0;i<sarkıcı_lsitesi.size();i++){
            System.out.println((i+1) + ". şarkıcı " +  sarkıcı_lsitesi.get(i));
        }
    }
    public void SarkıcıEkle(String isim){
        sarkıcı_lsitesi.add(isim);
        System.out.println(isim +"  eklendi ");
    }
    public void SarkıcıSil(int pozisyon){
        String şarkıcı= sarkıcı_lsitesi.get(pozisyon);
        sarkıcı_lsitesi.remove(pozisyon);
        System.out.println(şarkıcı + " isimli şarkıcı silindi ");
    }
    public void SarkıcıGüncelle(int pozisyon,String isim){

        sarkıcı_lsitesi.set(pozisyon,isim);
        System.out.println("Şarkıcı listesi güncellendi");
    }
    public void SarkıcıAra(String sarkıcı_ismi){
         int sarkıcı_pozisyon=sarkıcı_lsitesi.indexOf(sarkıcı_ismi);
         if(sarkıcı_pozisyon>0){
             System.out.println(" şarkıcı " + (sarkıcı_pozisyon+1) + ". sırada bulundu ");
         }
         
    }

}
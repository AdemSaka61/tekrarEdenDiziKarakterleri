import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class tekrarEdenler {
    public static void main(String[] args) {
        Scanner again = new Scanner(System.in);
        int sayac = 1, select;
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        List <Integer> diziListesi = new ArrayList<>();
        List <Integer> diziListesiYedek = new ArrayList<>();
        List<Integer> sayiAdetleri = new ArrayList<>();
        List<Integer> sayiAdetleri2 = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            diziListesi.add(list[i]);
            diziListesiYedek.add(list[i]);
        }
        diziListesi = diziListesi.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("---------------");
        diziListesi.forEach(i->{
            System.out.println(i);
            sayiAdetleri.add(0);
        } );
        System.out.println("---------------");
        int index = 0;
        for (int i=0; i<diziListesi.size(); i++){
            index = 0;
            for (int j = 0; j < diziListesiYedek.size(); j++){
                if(diziListesiYedek.get(j) == diziListesi.get(i)){
                    //System.out.println(diziListesi.get(i));
                    //System.out.println(diziListesiYedek.get(j));
                    index++;
                }
            }
            sayiAdetleri.set(i,index);
        }
        System.out.println("------------------");
        for (int i = 0; i < diziListesi.size(); i++){
            System.out.println(diziListesi.get(i) + " sayısı " + sayiAdetleri.get(i) + " kadar tekrar etti.");
        }
    }
}








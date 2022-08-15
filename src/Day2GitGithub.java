public class Day2GitGithub {
    /*
    1. git init --> Local repo olusturmak icin yani .git ile
    klasorumuzun içindeki dosyaları ilişkilendirmek için kullanılır
    2. git add . --> working spaceden (yani yerel) dosyalarımı staging
    area ya (yani commit lemek için beklenen yer) gonderir
    3. git commit -m"mesaj" --> stageing areadan commit stora dosyalarımı
    gondermek için kullanılır (yani commit, surum, versiyon olusturmus olurum)
    4. git push --> uzak repoya (yani remote(GitHub)) gondermek için kullandıgımız
    kod yalnız git push komutunu direk kullanmak istersek 1 kez
                git remote add origin adress
                git push -u origin master veya main
    Not: Yukarıdaki iki komutu tek seferde kullandıktan sonra diğer ikinci commit lerim için
    sadece git push kullanırız.

     */



    /*
    İlk defa PUSH yapacaksanız bir projeyi ;

1 - Önce GitHub a gidip New Repository i oluşturun
2- Oluşturduğunuz repository de size verilen https://github.com/.............git   adresini kopyalayın


Şimdi IntelliJ ye gelip TERMINAL ı açın;

3- git init yazın
4- git add . yazın
5- git commit -m"first commit"  (first commit yerine  ilke versiyon, ilk ders veya istediğiniz bir şeyi yazın)
6- git branch -M main
7- git remote add origin https://github.com/.............git (yukarıda2. satırda kopyalağınız adresi buraya yapıştırın)
8- git push -u origin main


SONRASINDA Aynı PROJE için ;

her yeni eklediğiniz şeyden sonra GitHub'a yüklemek için

9- git add .
10 - git commit -m"YENI NUMARA VEYA YAZI YAZ"
11 - git push


hepsi bu kadar
     */

    public static void main(String[] args) {
        System.out.println("GitHub deneme");
    }
}

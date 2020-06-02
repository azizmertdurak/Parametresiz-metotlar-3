package final3;
//Toplam kelime sayısını bulan program

public class Final3 {

    
        static int kelimesayaci()         //metot tanımladık.
        {  
            String cumle = "Nesne tabanlı programlama final ödevi";     //örnek cümle yazık
            int sayac=0;                                //sayaca sıfır değerini verdik.
            char kelime[]= new char[cumle.length()];   //cümle uzunluğunu kelime adında değişken tanımlayıp içine atalım.
            for(int i=0;i<cumle.length();i++)          //döngü oluşturup tüm karakterleri saydırıyoruz.
            {  
                kelime[i]= cumle.charAt(i);                
                if( ((i>0)&&(kelime[i]!=' ')&&(kelime[i-1]==' ')) || ((kelime[0]!=' ')&&(i==0)) )  //if ile kalanı kontrol ettiriyoruz.
                sayac++;                                //sayacı 1 artırdık.
            }  
            return sayac;                               //sayaçtan değer döndürüyoruz.
        }  
         
    public static void main(String[] args)  //ana kısım
    {
         System.out.println("Girilen cümle "+kelimesayaci() + " kelime");           //ekrana kaç cümle olduğunu yazdırıyoruz.
    }

}

    
    


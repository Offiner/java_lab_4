import java.util.*;
public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)
           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        int [] tab = new int[]{1,2,3,4,5,6};
        String nrIndeksu="0";
        Scanner scan = new Scanner(System.in);
        int liczba=0;
        do{
            if(liczba != 0)
                System.out.println("Niepoprawny numer!");
            System.out.println("Wprowadź numer indeksu: ");
            nrIndeksu = scan.next();
            try {
                //liczba = Double.parseDouble(text);
                liczba = Integer.parseInt(nrIndeksu);
            }
            catch(NumberFormatException exception){
                System.out.println("Nie podano liczby");
                break;
            }
            liczba = Integer.parseInt(nrIndeksu);


        }while (liczba > 5 | liczba < 0 );

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }
}

import java.awt.dnd.InvalidDnDOperationException;
import java.lang.reflect.Method;
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
        String[] tab = new String[]{"zero", "jeden", "dwa", "trzy", "cztery", "pięć"};
        String nrIndeksu = "0";
        boolean isString = false;
        Scanner scan = new Scanner(System.in);
        int liczba = 0;
        do {
            if ((liczba < 0 | liczba > 5) & isString != true)
                System.out.println("Niepoprawny numer!");
            System.out.println("Wprowadź numer indeksu: ");
            nrIndeksu = scan.next();
            try {
                //liczba = Double.parseDouble(text);
                liczba = Integer.parseInt(nrIndeksu);
            } catch (NumberFormatException exception) {
                isString = true;
                System.out.println("Nie podano liczby");

            }
        } while ((liczba > 5 | liczba < 0));
        System.out.println(tab[liczba]);

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        //a
        String tab2[] = new String[4];
        try {
            for (int i = 0; i < tab2.length; i++)
            if (tab2[i].startsWith("Kazik"));
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExcep...");
        }

        //b
        int wynik;
        try{
            wynik = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Aritmethic exceprtion!!!");
        }
        //c
        String [] tab3 = new String[]{"Pierwszy","Drugi","Trzeci"};
        try{

            System.out.println(tab3[scan.nextInt()]);

        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index poza tablicą!");
        } catch(ClassCastException exception) {
            System.out.println("Class coast!!!");
        } catch(InvalidDnDOperationException exception) {
            System.out.println("Zły DND!!");
        }

    }}




public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */
        Student s1 = new Student();
        s1.nrIndeksu(2133);
        s1.rokStudiow(3);
        s1.specjalizacja("Pływanie");
        s1.obywatelstwo("Hiszpańskie");
        s1.wiek(21);
        Student s2 = new Student();
        s2.nrIndeksu(2643);
        s2.rokStudiow(2);
        s2.specjalizacja("Joga");
        s2.obywatelstwo("Duńskie");
        s2.wiek(21);
        Pracownik p1 = new Pracownik();
        p1.uprawnienia(true);
        p1.lataPracy(3);
        p1.stanowisko("Sprzątacz");
        p1.obywatelstwo("Polskie");
        p1.wiek(31);
        Pracownik p2 = new Pracownik();
        p2.uprawnienia(false);
        p2.lataPracy(1);
        p2.stanowisko("Programista");
        p2.obywatelstwo("Hindus");
        p2.wiek(28);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());





        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}

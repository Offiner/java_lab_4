public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        prostokat p1 = new prostokat();
        p1.setA(5);
        p1.setB(4);
        System.out.println("Pole prostokąta: " + p1.pole());
        System.out.println("Obwód prostokąta");
        System.out.println(p1.obwod());
        kwadrat k1 = new kwadrat();
        k1.setA(5);

        System.out.println("Pole kwadratu: " + k1.pole());
        System.out.println("Obwód kwadratu: "+ k1.obwod());
    }
}

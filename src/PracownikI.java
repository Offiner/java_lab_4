public interface PracownikI extends CzlowiekI{
    String stanowisko(String stan);
    int lataPracy(int lat);
    boolean uprawnienia(boolean upr);
}

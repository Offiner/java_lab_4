public class Pracownik implements PracownikI{
    private int wiek;
    private String obywatelstwo;
    private String stanowisko;
    private int lataPracy;
    private boolean uprawnienia;
    @Override
    public int wiek(int wiek) {
        return this.wiek=wiek;
    }

    @Override
    public String obywatelstwo(String obywatelstwo) {
        return this.obywatelstwo=obywatelstwo;
    }

    @Override
    public String stanowisko(String stan) {
        return this.stanowisko=stan;
    }

    @Override
    public int lataPracy(int lat) {
        return this.lataPracy=lat;
    }

    @Override
    public boolean uprawnienia(boolean upr) {
        return this.uprawnienia=upr;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "wiek=" + wiek +
                ", obywatelstwo='" + obywatelstwo + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", lataPracy=" + lataPracy +
                ", uprawnienia=" + uprawnienia +
                '}';
    }
}

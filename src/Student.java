public class Student implements StudentI{
    private int wiek;
    private String obywatelstwo;
    private int nrIndeksu;
    private int rokStudiow;
    private String specjalizacja;
    @Override
    public int wiek(int wiek) {
        return this.wiek=wiek;
    }

    @Override
    public String obywatelstwo(String obywatelstwo) {
        return this.obywatelstwo=obywatelstwo;
    }

    @Override
    public int nrIndeksu(int nrInd) {
        return this.nrIndeksu=nrInd;
    }

    @Override
    public int rokStudiow(int rokSt) {
        return this.rokStudiow=rokSt;
    }

    @Override
    public String specjalizacja(String spec) {
        return this.specjalizacja=spec;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "wiek=" + wiek +
                ", obywatelstwo='" + obywatelstwo + '\'' +
                ", nrIndeksu=" + nrIndeksu +
                ", rokStudiow=" + rokStudiow +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}

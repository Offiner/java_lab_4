public class Student implements StudentI{
    private int wiek;
    private String obywatelstwo;
    private int nrIndeksu;
    private int rokStudiow;
    private String specjalizacja;
    @Override
    public int wiek() {
        return this.wiek=wiek();
    }

    @Override
    public String obywatelstwo() {
        return null;
    }

    @Override
    public int nrIndeksu() {
        return 0;
    }

    @Override
    public int rokStudiow() {
        return 0;
    }

    @Override
    public String specjalizacja() {
        return null;
    }

    public Student() {
    }

}

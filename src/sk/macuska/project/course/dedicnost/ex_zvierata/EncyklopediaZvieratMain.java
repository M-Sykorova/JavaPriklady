package sk.macuska.project.course.dedicnost.ex_zvierata;

public class EncyklopediaZvieratMain {
    public static void main(String[] args) {
        Delfin delfin = new Delfin();
        delfin.hybeSa();
        delfin.sajeMlieko();
        System.out.println(delfin.JE_TEPLOKRVNY);
        System.out.println(delfin.SRST);

        Vlk vlk = new Vlk();
        vlk.hybeSa();
        vlk.sajeMlieko();
        System.out.println(vlk.JE_TEPLOKRVNY);
        System.out.println(vlk.MA_SRST);

    }
}

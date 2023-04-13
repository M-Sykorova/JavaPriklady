import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Matica {
    public static void main(String[] args) {



        //Vytvorte (vypíšte) maticu údajov do konzoly
        final int MAX = 25;
        for(int i = 1; i <= MAX; i++){
            if(i%5 == 0){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }


        //Vypiseme aktualny cas - odmeranie kolko trva moj program
        String timeStampStart = new SimpleDateFormat("HH.mm.ss.SSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampStart);


        //Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej hodnoty (začneme 1) : RIESENIE 1
        int j = 1;
        for(int i = 1; i <= MAX; i++){
            if(i%5 == 0){
                System.out.println(j);
            } else {
                System.out.print(j + " ");
            }
            j = j * 2;
        }

        System.out.println();

        String timeStampEnd = new SimpleDateFormat("HH.mm.ss.SSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampEnd);





    }
}

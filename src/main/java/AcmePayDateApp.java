import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AcmePayDateApp {

    public static void main(String []args) {
        for (int month = 1; month <= 12; month++)
            System.out.println(getLastFriday(month, 2015));
    }

    public static String getLastFriday(int month, int year ) {
        Calendar cal = Calendar.getInstance();
        cal.set( year, month, 1 );
        cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 1 ) );
        return new SimpleDateFormat("MMMM").format(cal.getTime()) + "-" + cal.get(Calendar.DATE);
    }

}

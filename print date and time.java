import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime {
    public static void main(String[] args) {
        
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

       
        String formattedDate = dateFormat.format(date);

        System.out.println("Current date and time: " + formattedDate);
    }
}

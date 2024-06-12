package gr.aueb.cf.ch14;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;



public class Logger {

    public static Logger instance;



    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage (String message) {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.err.println(formatter.format(ts) + " - " + message);
    }


}

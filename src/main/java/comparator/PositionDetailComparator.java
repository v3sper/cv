package comparator;

import models.PositionDetail;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Comparator;

public class PositionDetailComparator implements Comparator<PositionDetail> {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");

    @Override
    public int compare(PositionDetail o1, PositionDetail o2) {
        DateTime dateTime1 = dateTimeFormatter.parseDateTime(o1.getStartDate());
        DateTime dateTime2 = dateTimeFormatter.parseDateTime(o2.getStartDate());
        return dateTime2.compareTo(dateTime1);
    }
}

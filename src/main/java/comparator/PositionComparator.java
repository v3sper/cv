package comparator;

import models.Position;
import models.PositionDetail;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Comparator;
import java.util.List;

public class PositionComparator implements Comparator<Position> {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");

    @Override
    public int compare(Position o1, Position o2) {
        List<PositionDetail> positionDetails1 = o1.getPositionDetails();
        List<PositionDetail> positionDetails2 = o2.getPositionDetails();
        DateTime startDate1 = dateTimeFormatter.parseDateTime(positionDetails1.get(0).getStartDate());
        DateTime startDate2 = dateTimeFormatter.parseDateTime(positionDetails2.get(0).getStartDate());
        return startDate2.compareTo(startDate1);
    }
}

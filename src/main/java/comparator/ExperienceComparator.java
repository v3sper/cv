package comparator;

import models.Experience;
import models.Position;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Comparator;
import java.util.List;

public class ExperienceComparator implements Comparator<Experience> {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");

    @Override
    public int compare(Experience o1, Experience o2) {
        List<Position> positions1 = o1.getPositions();
        List<Position> positions2 = o2.getPositions();
        DateTime startDate1 =
                dateTimeFormatter.parseDateTime(positions1.get(0).getPositionDetails().get(0).getStartDate());
        DateTime startDate2 =
                dateTimeFormatter.parseDateTime(positions2.get(0).getPositionDetails().get(0).getStartDate());
        return startDate2.compareTo(startDate1);
    }
}

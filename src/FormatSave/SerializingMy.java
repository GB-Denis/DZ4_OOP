package FormatSave;

import java.util.Calendar;

public interface SerializingMy<T extends Task> {
    void exportingCalendar(Calendar<T> calendar, String path);
    Calendar<T> importingCalendar(String path);
}
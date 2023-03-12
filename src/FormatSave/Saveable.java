package FormatSave;



import java.util.List;

public interface Saveable<T extends Task> {
    void saveAs(List<T> calendar, String path);
}
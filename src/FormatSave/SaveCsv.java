package FormatSave;

import Task;

import java.awt.image.ImagingOpException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveCsv extends SaveFormat<Task> {
    @Override
    public void saveAs(List<Task> calendar, String path) {
        try(FileWriter writer = new FileWriter(path+".csv", true)) {
            for(Task t :calendar){
                writer.write(t.toString());
            }
        }
        catch (ImagingOpException e){
            e.printStackTrace();
        }
    }
}
package fileSave;

import java.io.File;
import java.io.IOException;

public class SaveFileFinder {
    private static final String pathToFile = "SaveFiles/saveFile";


public static File getSaveFile() {
    try {
        File file = new File(pathToFile);
        file.createNewFile();
        return file;
    } catch (IOException e) {
        System.out.println("there was an error in getting the SaveFile:\n" + e.getMessage());
    }
    return null;
}
}

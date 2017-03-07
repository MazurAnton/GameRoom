package helmes.example.utilities;

import java.io.*;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public final class FileUtilities {

    public static final String FILE_WITH_TOY_CATAGORY = "resources/toy_category";
    public static final String FILE_WITH_TOYS_NAME = "resources/toys_name";

    public static String read(String fileName) {

        StringBuilder stringBuilder = new StringBuilder();
        File file = null;

        if (new File(fileName).exists()) {
            file = new File(fileName);
        }

        BufferedReader input = null;

        try {
            input = new BufferedReader(new FileReader(file.getAbsoluteFile()));

            String readString;
            while ((readString = input.readLine()) != null) {
                stringBuilder.append(readString);
                stringBuilder.append("\n");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (input != null)
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return stringBuilder.toString();
    }
}

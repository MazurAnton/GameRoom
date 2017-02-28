package toysnamefile;

import java.io.*;

/**
 * Created by anton.mazur on 2/27/2017.
 */
public class WorkInFile {

    public static final String FILE_WITH_TOY_CATAGORY = "C://work/GameRoomProject/toy_category";
    public static final String FILE_WITH_TOYS_NAME = "C://work/GameRoomProject/toys_name";

    public static String read(String fileName) throws FileNotFoundException {

        StringBuilder stringBuilder = new StringBuilder();
        File file  = new File(fileName);

        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        try{
            BufferedReader input = new BufferedReader(new FileReader( file.getName()));
            try {
                String readString;
                while ((readString = input.readLine()) != null) {
                    stringBuilder.append(readString);
                    stringBuilder.append("\n");
                }
            }finally {
                input.close();
            }
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}

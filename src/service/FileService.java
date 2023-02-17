package service;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {

public static String[] read(String url) throws Exception{

    return Files.readAllLines(Path.of(url)).toArray(new String [0]);

}

}

package com.techouts.assessment2.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilesEx {
    private static final Logger logger = Logger.getLogger(FilesEx.class.getName());

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("C:\\Users\\tech\\IdeaProjects\\Techouts-Java\\src\\com\\techouts\\assessment2\\fileio\\File3.txt");
        if (!Files.exists(file)) {
            Files.createFile(file);
            logger.info("File created");
        }
        Files.write(file, "Hi I am from File3".getBytes());
        logger.log(Level.INFO, "{0}", Files.readString(file));
        Files.delete(file);
        logger.info("File deleted");
    }
}

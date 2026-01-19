package com.techouts.assessment2.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NIOEx {
    private static final Logger LOGGER = Logger.getLogger(NIOEx.class.getName());

    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\tech\\IdeaProjects\\Techouts-Java\\src\\com\\techouts\\assessment2\\fileio\\File1.txt");
        Path destination = Paths.get("C:\\Users\\tech\\IdeaProjects\\Techouts-Java\\src\\com\\techouts\\assessment2\\fileio\\File2.txt");
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        LOGGER.info("Files copied successfully");
    }
}

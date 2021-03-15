package com.kpi.fict.it01.team1.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static String readFile(String path) throws IOException {
        Path filePath = Paths.get(path);

        if (!Files.exists(filePath)) {
            throw new FileNotFoundException(path + " not found!");
        }

        return StringUtils.removeAllDelimiters(String.join(" ", Files.readAllLines(filePath)));
    }
}

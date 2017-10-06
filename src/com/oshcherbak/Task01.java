package com.oshcherbak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by oshcherbak on 10/6/17.
 * <p>
 * Task:
 * Write a program to find all distinct words from a text file. Ignore chars like ".,/-;:" and Ignore case sensitivity.
 */
public class Task01 {
    public static final String FILE_PATH = "res/res.txt";

    private static final String PATTERN = "[\\s.,/\\-;:]+";
    private static final String INVERSE_PATTERN = "[^\\s.,/\\-;:]+";

    public static List<String> readFileAndParseVar1(String filePath) throws IOException {
        List<String> stringList = new ArrayList<>();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] str = line.split(PATTERN);
                Collections.addAll(stringList, str);
                line = bufferedReader.readLine();
            }
        } finally {
            // in java 7+ not necessary
            fileReader.close();
            bufferedReader.close();
        }

        return stringList;
    }

    public static List<String> readFileAndParseVar2(String path) throws IOException {
        List<String> stringList = new ArrayList<>();

        Files.readAllLines(Paths.get(path)).forEach(line -> {
            // can use <String>.split
            Matcher matcher = Pattern.compile(INVERSE_PATTERN).matcher(line);
            while (matcher.find())
                stringList.add(matcher.group());
        });
        return stringList;
    }

    public static List<String> readFileAndParseVar3(String path) throws IOException {
        List<String> stringList = new ArrayList<>();

        Files.lines(Paths.get(path)).forEach(line -> {
            // can use <String>.split
            Matcher matcher = Pattern.compile(INVERSE_PATTERN).matcher(line);
            while (matcher.find())
                stringList.add(matcher.group());
        });
        return stringList;
    }
}

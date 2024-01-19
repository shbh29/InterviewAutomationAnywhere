package org.example;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String rootFolder = "/home/ssingh/InterviewAutomationAnywhere";
        File rf = new File(rootFolder);

        List<File> folder = new ArrayList<>();
        folder.add(rf);

        while(!folder.isEmpty()) {
            /**
             * list all files of folder
             * create new File for every list item
             * if file is a folder add in a list
             * if file is not a folder print.
             */
            File current = folder.get(0);
            folder.remove(0);
            File[] folderItems = current.listFiles();
            if (folderItems != null) {
                for (File file : folderItems) {
                    folder.add(file);
                }
            }
            if (!current.isDirectory()) {
                System.out.println(current.getName());
            }
        }
    }
}
package dev.jotacraq.maratonajava.javacore.Minterfaces.test;

import dev.jotacraq.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import dev.jotacraq.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import dev.jotacraq.maratonajava.javacore.Minterfaces.dominio.FileLoader;

import java.io.File;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader =  new DatabaseLoader();
        FileLoader fileLoader =  new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}

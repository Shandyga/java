/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinfo;

import java.io.File;

/**
 *
 * @author Admin
 */
public class FileInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("src/fileinfo/Text.txt");
        System.out.println("Файл доступен для чтения - " + file.canRead());
        System.out.println("Файл доступен для записи - " + file.canWrite());
        System.out.println("Файл существует - " + file.exists());
        /*System.out.println("Полный путь - " + file.getAbsolutePath());
        System.out.println("Имя файла - " + file.getName());
        System.out.println("Название родительской директории - " + file.getParent());
        System.out.println("Это файл - " + file.isFile());
        System.out.println("Это директория - " + file.isDirectory());
        System.out.println("Последнее время изменения - " + file.lastModified());
        File parent = file.getAbsoluteFile().getParentFile().getParentFile().getParentFile();
        System.out.println(parent.getAbsolutePath());
        File[] files = parent.listFiles();
        for (File f : files) {
            System.out.println("-----------");
            System.out.println(f);
            System.out.println("Размер файла: " + f.length());
            System.out.println("Это файл - " + f.isFile());
        }*/
    }
    
}

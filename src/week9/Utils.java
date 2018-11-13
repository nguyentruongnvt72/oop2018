package week9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Utils {
    public static String readContentFromFile(String path) {
        StringBuilder read = new StringBuilder();
        try(Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)){
            stream.forEach(s -> read.append(s).append("\n"));
        }catch (IOException e){
            e.printStackTrace();
        }
        return read.toString();
    }

    public static void writeAddContentToFile(String path){
        String FILENAME = path;
        System.out.println("Them tu");

        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            String addword;
            Scanner Content = new Scanner(System.in);
            addword = Content.nextLine();

            bw.write(addword);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void writeContentToFile(String path){
        String line = null;
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String a=null;
        try {
            FileReader reader = new FileReader(path);
            BufferedReader in = new BufferedReader(reader);

            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            fw.write(word);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if(file.exists()){
            if(file.isFile()){
                if(file.getName().endsWith(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if(listFile != null){
                for(File f : listFile){
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        }
        return null;
    }
    public static void main(String[] abc) {
        Utils a = new Utils();
        //findFileByName() fileAdd = new File("week9", "file");
        //a.writeContentToFile("/Users/truongnguyen/Downloads/oop2018s/src/week9/file.txt");
        a.writeAddContentToFile("/Users/truongnguyen/Downloads/oop2018s/src/week9/file.txt");
        System.out.println(a.readContentFromFile("/Users/truongnguyen/Downloads/oop2018s/src/week9/file.txt"));
        a.findFileByName("/Users/truongnguyen/Downloads/oop2018s/src/week9", "file.txt");
    }
}

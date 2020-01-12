package com.myapp;
import javax.print.DocFlavor;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            String pathR="C:\\Users\\Develop\\Desktop\\java\\ReverseOfNumVirtusa\\Assignment4\\read.txt";
            String pathW="C:\\Users\\Develop\\Desktop\\java\\ReverseOfNumVirtusa\\Assignment4\\write.txt";
            FileReader file=new FileReader(pathR);
            WordUpperCase b=new WordUpperCase(file);
            FileWriter fileW=new FileWriter(pathW);
            BufferedWriter bW= new BufferedWriter(fileW);
            String st;
            while((st=b.readLine()) !=null)
            {
                bW.write(st+"\n");
            }
            bW.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

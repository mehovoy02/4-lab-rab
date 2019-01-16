import java.io.FileNotFoundException;

import java.util.Scanner;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Лабораторная работа №4");
        System.out.println("ПЭ-171 Алтынпара Артём Вячеславович");
        System.out.println("Условие:Спроектировать архитектуру ПО для перезаписи текстовых файлов с отображением скорости записи.");
        System.out.println("=======================================================================================");
        System.out.println("Write read's file path : ");
        Scanner scanR=new Scanner(System.in);
        String pathRead=scanR.next();
        File FileRead= new File(pathRead);
        System.out.println("Write write's file path : ");
        Scanner scanW=new Scanner(System.in);
        String pathWrite=scanW.next();
        File FileWrite= new File(pathWrite);
        ReaderAndSaver ras=new ReaderAndSaver();
        ras.ReadWrite(pathRead,pathWrite);
        System.out.println("OK");
    }
}

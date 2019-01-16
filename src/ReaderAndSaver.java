import java.util.Date;

import java.util.Scanner;

import java.io.*;
public class ReaderAndSaver {
    private InputStream inputStream;
    private OutputStream outputStream;
    int i=0;
    int fourMB=4*1024*1024;
    byte [] buffer=new byte[fourMB];
    public void ReadWrite(String pathRead, String pathWrite) throws IOException{
        File file=new File(pathRead);
        long weight=file.length();
        Date timeStart=new Date();
        long msecStart = timeStart.getTime();
        inputStream= new FileInputStream(pathRead);
        outputStream= new FileOutputStream(pathWrite);
        int symbol;
        while ((symbol=inputStream.read(buffer))!=-1) {
            outputStream.write(buffer,0,symbol);
        }
        inputStream.close();
        outputStream.close();
        Date timeFinish=new Date();
        long msecFinish = timeFinish.getTime();
        long time=(msecFinish-msecStart);
        if(time<1000)
            System.out.println("Working time: "+time+"ms");
        else
        if(time>1000&&time<60000)
            System.out.println("Working time: "+(time/1000)+"sec");
        if(time<1000)
            System.out.println("Write's speed: "+(weight/time)+"bytes/ms");
        if(time>1000&&time<60000)
            System.out.println("Write's speed: "+(weight/(time/1000))+"bytes/sec");
    }
}


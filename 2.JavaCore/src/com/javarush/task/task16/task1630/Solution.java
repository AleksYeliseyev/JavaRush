package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        try {
            firstFileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        } catch (IOException e) {
            System.out.println("ERROR!!!");
        }
        try {
            secondFileName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            System.out.println("ERROR!!!");
        }
        /*firstFileName = "file1.txt";
        secondFileName = "file2.txt";*/
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private static String fileName = null;
        private String resultString = "";

        @Override       // Устанавливает имя файла для считывания
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return resultString;
        }

        public void run() {
            BufferedReader filereader = null;
            try {
                filereader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String line;
                while (filereader.ready()) {
                    line = filereader.readLine();
                    if(line.isEmpty()){
                        continue;
                    }
                    resultString = resultString.concat(line) + " ";

                }
                resultString.trim();
                interrupt();
                filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

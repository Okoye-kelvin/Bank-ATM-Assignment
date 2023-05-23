package BankFile;

import java.io.*;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Bankfile {

    public static void main(String[] args) throws IOException {

        Bankfile fileWritermain = new Bankfile();
        fileWritermain.appendData("");
    }

    public static void appendData(String data) throws IOException {

        File myFile = new File("TransactionDetail.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(myFile, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        String line = dateTime + " - " + data;
        printWriter.println(line);
        printWriter.print(data);

        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();

    }

}

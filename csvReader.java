package Streams.Expenses_calculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class csvReader {
    public static ArrayList<Transaction> load(String expenses){
        ArrayList<Transaction> list = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(expenses));
            br.readLine(); // reads first line
            String line;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            while((line = br.readLine())!=null){
                String[] data = line.split(",");

                Transaction t = new Transaction(
                        Integer.parseInt(data[0]),
                        LocalDate.parse(data[1],formatter),
                        data[2],
                        data[3],
                        Integer.parseInt(data[4]),
                        data[5]
                );
                list.add(t);

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot be read data");
        }

        return list;

    }

}

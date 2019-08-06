package JavaSEConcurrency.runnables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AsyncFileReaderThread extends Thread {

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/arajj1/workspace/prpc-platform/static-modules/hierarchical-table/dev/test.html"));
            String line = "";
            while ((line = reader.readLine()) != null){
                System.out.println(Thread.currentThread().getName() + ": " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

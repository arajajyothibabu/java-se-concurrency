package JavaSEConcurrency;

import JavaSEConcurrency.runnables.AsyncFileReaderRunnable;
import JavaSEConcurrency.runnables.AsyncFileReaderThread;

/**
 * Hello world!
 *
 */
public class App {

    static void basicThreads(){

        AsyncFileReaderThread thread1 = new AsyncFileReaderThread();
        AsyncFileReaderThread thread2 = new AsyncFileReaderThread();
        AsyncFileReaderThread thread3 = new AsyncFileReaderThread();

        thread1.start();
        thread2.start();
        thread3.start();

        AsyncFileReaderRunnable runnable1 = new AsyncFileReaderRunnable();
        AsyncFileReaderRunnable runnable2 = new AsyncFileReaderRunnable();
        AsyncFileReaderRunnable runnable3 = new AsyncFileReaderRunnable();

        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();

    }

    static void testUserProcessing(){

    }

    public static void main( String[] args ) {

        //System.out.println( "Hello World!" );

        //basicThreads();

        testUserProcessing();


    }

}

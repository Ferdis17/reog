package sept_2022.designpattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogger {

    private static SingletonLogger logger = null;

    private final String logFile = "demo_better_log.txt";
    private PrintWriter writer;

    private SingletonLogger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
            writer.println("Logging file for the bank operations");
            writer.println("=====================================");
        } catch (IOException e) {}
    }

    public static synchronized SingletonLogger getInstance(){
        if(logger == null)
            logger = new SingletonLogger();
        return logger;
    }

    public void logWithdraw (String account, double amount) {
        writer.println("WITHDRAW (" + account + "): " + amount + "$");
    }

    public void logDeposit (String account, double amount) {
        writer.println("DEPOSIT (" + account + "): " + amount + "$");
    }

    public void logTransfer (String fromAccount, String toAccount, double amount) {
        writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + amount + "$");
    }
}

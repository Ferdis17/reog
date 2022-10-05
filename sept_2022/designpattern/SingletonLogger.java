package sept_2022.designpattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SingletonLogger {

    private static SingletonLogger logger = null;

    private final String logFile = "demo_better_log.txt";
    private PrintWriter writer;

    private SingletonLogger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            Logger logger1 = Logger.getLogger(SingletonLogger.class.getName());
            writer = new PrintWriter(fw, true);
            writer.println("Logging file for the bank operations");
            writer.println("=====================================");

            FileHandler handler = new FileHandler(logFile);
            handler.setFormatter(new SimpleFormatter());
            logger1.addHandler(handler);
            logger1.setLevel(Level.FINEST);
            logger1.finest("trying this");
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

package singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

  public static Logger INSTANCE = new Logger();

  private Logger() {
  }

  public void log(Object object) {
    try (
        FileWriter fileWriter = new FileWriter("messages.log", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter)
    ) {
      printWriter.write(LocalDateTime.now() + ": " + object + "\r\n");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

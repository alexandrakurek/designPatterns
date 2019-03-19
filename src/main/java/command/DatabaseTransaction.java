package command;

import java.util.ArrayList;
import java.util.List;

// Executor
public class DatabaseTransaction {

//  executor powinien miec liste akcji (interfejsow)
//
  private List<DatabaseOperation> operations = new ArrayList<>();

  public void addOperation(DatabaseOperation operation) {
    operations.add(operation);
  }

  public void commit() {
//    przyklady lambd
//    operations.stream()
//        .sorted((elem1, elem2) -> {
//          System.out.println(elem1);
//          System.out.println(elem2);
//          return 1;
//        });

//    operations.forEach(operation -> operation.execute());

    // potrzebujemy sprawdzic, czy ktoras z operacji czasem sie nie udala
    boolean transactionFailed = false;

    for (DatabaseOperation operation : operations) {
      // wykonujemy kazda operacje
      if (!operation.execute()) {
        // jesli jakas operacja sie nie uda ustawiamy flage i nie wykonujemy nastepnych
        transactionFailed = true;
        break;
      }
    }

    // jesli jakas operacja sie nie udala
    if (transactionFailed) {
      // przechodzimy przez wszystkie operacje
      for (DatabaseOperation operation : operations) {
        // jesli juz zostala wykonana
        if (operation.wasExecuted()) {
          // odwroc dana operacje
          operation.rollback();
        }
      }
    }
  }
}

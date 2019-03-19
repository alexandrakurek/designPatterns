package command;

import java.util.ArrayList;
import java.util.List;

public class DataBasedTransaction {
    private List<DataBasedOperation> operations = new ArrayList<>();

    public void addOperation(DataBasedOperation operation) {
        operations.add(operation);
    }

    public void commit() {
        operations.stream()
                .sorted((elem1, elem2) -> { // porownanie 2 elementow
                    System.out.println(elem1);
                    System.out.println(elem2);
                    return 1;
                });
        operations.forEach(operation -> operation.execute());

        for (DataBasedOperation operation : operations) {
            if (!operation.execute()) {
                break;
            }
        }
        for (DataBasedOperation operation : operations) {
            if (!operation.execute()) {
                break;
            }


        }
    }
}

    // for (DataBasedOperation operation : operations){
    // operation.exeute();





   // public int sort (DataBasedOperation elem1, DataBasedOperation elem2){
   //     System.out.println(elem1);
   //     System.out.println(elem2);
    //    return 1;
   // }


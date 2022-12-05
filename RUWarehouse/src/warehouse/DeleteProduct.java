package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse newWarehouse = new Warehouse();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++){
            String addOrDelete = StdIn.readString();
            if (addOrDelete.equals("add")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newWarehouse.addProduct(id, name, stock, currentDay, demand);
            }
            else if (addOrDelete.equals("delete")){
                int id = StdIn.readInt();
                newWarehouse.deleteProduct(id);
            }
        }
        StdOut.println(newWarehouse);
	// Use this file to test deleteProduct
    }
}

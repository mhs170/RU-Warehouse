package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse newWarehouse = new Warehouse();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++){
            String s = StdIn.readString();
            if (s.equals("add")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newWarehouse.addProduct(id, name, stock, currentDay, demand);
            }
            else if (s.equals("purchase")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newWarehouse.purchaseProduct(id, currentDay, amount);
            }
            else if (s.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newWarehouse.restockProduct(id, amount);
            }
            else if (s.equals("delete")){
                int id = StdIn.readInt();
                newWarehouse.deleteProduct(id);
            }
        }
        StdOut.println(newWarehouse);
	// Use this file to test all methods
    }
}
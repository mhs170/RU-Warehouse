package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse newWarehouse = new Warehouse();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++){
            String addOrRestock = StdIn.readString();
            if (addOrRestock.equals("add")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newWarehouse.addProduct(id, name, stock, currentDay, demand);
            }
            else if (addOrRestock.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newWarehouse.restockProduct(id, amount);
            }
        }
        StdOut.println(newWarehouse);
	// Uset his file to test restock
    }
}

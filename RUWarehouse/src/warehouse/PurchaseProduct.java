package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse newWarehouse = new Warehouse();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++){
            String addOrPurchase = StdIn.readString();
            if (addOrPurchase.equals("add")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newWarehouse.addProduct(id, name, stock, currentDay, demand);
            }
            else if (addOrPurchase.equals("purchase")){
                int currentDay = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newWarehouse.purchaseProduct(id, currentDay, amount);
            }
        }
        StdOut.println(newWarehouse);
	// Use this file to test purchaseProduct
    }
}

public class Main {
    public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager();
    customerManager.dataBaseManager =new MySqlDataBaseSql();
    customerManager.getCustomers();
    }
}
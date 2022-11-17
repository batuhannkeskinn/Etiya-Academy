public class Main {
    public static void main(String[] args) {
//    BaseLog[] baseLogs = new BaseLog[]{new FileLogger(),new DataBaseLogger(), new EmailLogger(),new ConsoleLogger()};
//    for (BaseLog logger:baseLogs){
//        logger.log("log Mesajı ");
//    }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
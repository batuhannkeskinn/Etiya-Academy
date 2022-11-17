public class CustomerManager {
    private BaseLog baseLog;
    public CustomerManager(BaseLog baseLog){
        this.baseLog = baseLog;
    }
    public void add(){

        System.out.println("Müşteri Eklendi");
        this.baseLog.log("log mesajı");

    }
}

public class OgrenciKrediManager extends BaseKrediManager {
    //override Her ne kadar Extends de olsa sadece bağlı taklit de etmeyebilir.
    public double hesapla (double tutar){
        return tutar * 1.10 ;
    }
}

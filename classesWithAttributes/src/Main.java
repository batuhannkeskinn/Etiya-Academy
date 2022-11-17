public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.setName("Leptop") ;
    product.setId(1) ;
    product.setDescription("Asus") ;
    product.setPrice(5000);
    product.setStockAmount(5) ;
    System.out.println(product.getName());

    ProductManager productManager = new ProductManager();
    productManager.add(product);
    //YANLIŞ BİR KOD
    productManager.add2(1,"","",5,200);

    System.out.println(product.getCode());
    }
}
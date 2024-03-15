import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Seller s=new Seller();
        s.addProduct("TV","this is a lg tv","lg.jpg",28000.0,"TV","");
        s.addProduct("Lg phone","this is a lg phone","lg_phone.jpg",8000.0,"phone","");
        s.addProduct("Apple phone","this is a APPLE phone","phone.jpg",89000.0,"phone","");
       /* List<ProductDetails> ans= s.getProducts();
        for(ProductDetails x:ans){
            System.out.println(x);
        }*/


        /*List<ProductDetails> ans=s.getCategory("phone");
        for(ProductDetails x:ans){
            System.out.println(x);
        }*/
       // String re;
        //re=sc.nextLine();
        //s.setreview(re,"Apple phone");
        s.setreview("hi,good product,go fot it!","Apple phone");
        System.out.println(s.getReview("Apple phone"));
        System.out.println(s.getReview("TV"));
        //s.messageSeller("good");
        //s.messageSeller("bad");

        //app h=new app();
        //h.Help();
        //System.out.println(s.getReview("TV"));

    }
}
import java.util.*;
public class Seller {
    List<ProductDetails> products;
    public Seller()
    {
        this.products=new ArrayList<ProductDetails>();
    }
    public void addProduct(String name,String des,String imageurl,double price,String category,String review)
    {
        ProductDetails p=new ProductDetails(name,des,imageurl,price,category,review);
        products.add(p);
    }
    public List<ProductDetails> getProducts(){

        return products;
    }
    public List<ProductDetails> getCategory(String category){

        List<ProductDetails> cat=new ArrayList<>();
        for(ProductDetails x:products){
            if(x.caty().equalsIgnoreCase(category)){
                cat.add(x);
            }
        }return cat;
    }
    public void setreview(String review,String prod) {
        for(ProductDetails it:products) {
            if(it.pro().equals(prod)) {
                it.review+="\n"+review;
            }
        }

    }
    public String getReview(String prod){
        for(ProductDetails it:products) {
            if(it.pro().equals(prod)&&(it.review!="")) {
                return it.getReview();
            }
        }return "No review Available for this product "+prod;
    }
    public void messageSeller(String msg){
        if(msg.equals("good")){
            System.out.println("Thank you,let me if you wan to buy any other Products");
        }else{
            System.out.println("Sorry for the inconvenience,we will rectify our mistake");
        }
    }
    public void getShippingDetails(){

        System.out.println("Your order is shipped and will delivery within few days");
    }

}

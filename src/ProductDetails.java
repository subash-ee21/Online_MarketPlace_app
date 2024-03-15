public class ProductDetails {
    private String name;
    private String des;
    private String imageurl;
    private double price;
    private String category;
    public String review;
    public ProductDetails(String name,String des,String imageurl,double price,String category,String review){
        this.name=name;
        this.des=des;
        this.imageurl=imageurl;
        this.price=price;
        this.category=category;
        this.review=review;
    }
    public String toString()
    {
        return "Product_Name: "+name+"\nDescription: "+des+"\nImage: "+imageurl+"\nPrice: "+price+"\n";
    }
    public String caty(){

        return category;
    }
    public String pro(){

        return name;
    }
    /*public void setReview(String review){
        this.review=review;
    }*/
    public String getReview(){

        return review;
    }

}

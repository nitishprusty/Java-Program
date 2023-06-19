package Java.Github.RetailShop;

import java.util.Scanner;

public class shop {
    private String ShopName;
    private String shopAddress;
    private String [] products;

    public shop(String Shopname,String shopAddress,String [] products){
        super();
        this.ShopName = Shopname;
        this.shopAddress = shopAddress;
        this.products = products;
    }

    public void setShopName(String shopName){
        this.ShopName = shopName;
    }
    public String getShopName(){
        return ShopName;
    }

    public void setshopAddress(String shopAddress){
        this.shopAddress = shopAddress;
    }
    public String getshopAddress(){
        return shopAddress;
    }

    public void setProducts(String [] products){
        this.products = products;
    }

    public String [] getProducts(){
        return products;
    }

    public boolean checkProductAvailability(String productName){
        for(int i = 0;i<products.length;i++){
            if(productName.equalsIgnoreCase(products[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of shop");
        String shopName = sc.next();
        System.out.println("Enter the ShopAdress");
        String shopAdress = sc.nextLine();

        System.out.println("Enter the Total size of products");
        int size = sc.nextInt();

        String [] products = new String[size];
        for(int i = 0;i<size;i++){
            products[i] = sc.next();
        }

        shop obj = new shop(shopName, shopAdress, products);

        System.out.println("Enter the product to be searched");
        String productsearch = sc.next();

        if(obj.checkProductAvailability(productsearch)){
            System.out.println("Product available at " + obj.getShopName() + " " + obj.getshopAddress());
        }else{
            System.out.println("Product not available at " + obj.getShopName() + " " + obj.getshopAddress());
        }

        sc.close();

    }
}

package Java.Control_Structures_iteration.Product_details;

public class shop {

    private String [] productName;
    private float [] productprice;
    private int [] productquantity;

    public shop(String [] pname,float [] price,int [] pquan) {
        this.productName = pname;
        this.productprice = price;
        this.productquantity = pquan;
    }

    String [] search(int quantity) {
        int c = 0;
        for(int  i = 0;i<productquantity.length;i++) {
            if(quantity == productquantity[i]) {
                c++;
            }
        }
        String [] ans = new String[c];
        for(int i = 0,j=0;i<productquantity.length;i++) {
            if(quantity == productquantity[i]) {
                ans[j++] = productName[i] + ":" + productprice[i];
            }
        }
        return ans;
    }
    String [] search(float price) {
        int c = 0;
        for(int i = 0;i<productprice.length;i++) {
            if(price == productprice[i]) {
                c++;
            }
        }
        String [] ans1 = new String[c];
        for(int i = 0,j = 0;i<productprice.length;i++) {
            if(price == productprice[i]) {
                ans1[j++] = productName[i] + ": " +  productquantity[i];
            }
        }
        return ans1;
    }
    String [] search() {
        int c = 0;
        for(int i = 0;i<productquantity.length;i++) {
            if(productquantity[i] < 10) {
                c++;
            }
        }
        String [] ans2 = new String[c];
        for(int i = 0,j = 0;i<productquantity.length;i++) {
            if(productquantity[i] < 10) {
                ans2[j++] = productName[i];
            }
        }
        return ans2;
    }
}

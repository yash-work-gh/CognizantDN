package Week1_AlgorithmsDataStructures.Exercise2_EcommercePlatformSearchFunction.Code;


import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
    
    // Linear Search Method
    public static Product linearSearch(Product[] products, String targetName){
        for (Product product : products){
            if (product.getProductName().equalsIgnoreCase(targetName)){
                return product;
            }
        }
        return null;
    }

    //Binary Search Method (requires sorted array)
    public static Product binarySearch(Product[] products, String targetName){
        int low=0,high=products.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(targetName);

            if(comparison==0){
                return products[mid];
            }
            else if(comparison<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }

    //Helper method to sort product by productName

    public static void sortProductsByName(Product[] products){
        Arrays.sort(products, Comparator.comparing(Product::getProductName,String.CASE_INSENSITIVE_ORDER));
    }
}

package Validation;

public class ProductValidation {
    public static boolean validateName(String name){
        return !(name.isBlank() || name.isEmpty()) && name.matches("^([ÅZÆØ][a-zæøå]*[- ]?)*");
    }

    public static boolean validateBrandName(String brandName){
        return false;
    }

    public static boolean validatePrice(int price){
        return false;
    }

    public static boolean valdiatePrice(int price){
        return false;
    }

    public static boolean validatePartNumber(String partNumber){
        return false;
    }
}

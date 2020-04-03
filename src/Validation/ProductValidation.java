package Validation;
//Fiks validering for pris (alle tall fra 0-99999)
//
//Fiks validering for varenavn (kan inneholde tall, mellomrom, store og små bokstaver og æøå)
//
//Fiks validering for varenummer (8 siffer, kun tall 0-9)

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

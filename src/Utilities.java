public final class Utilities {
    public static float convertMontantToFloat(String montant){
        montant = montant.replace("$","");
        float montantNombre = Float.parseFloat(montant);
        return montantNombre;
    }
    public static String convertMontantToString(float montant){

        return "" + montant + "$";
    }

}

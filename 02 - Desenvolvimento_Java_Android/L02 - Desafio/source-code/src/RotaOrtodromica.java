import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RotaOrtodromica {

    private double retorno;
    
    public RotaOrtodromica() {
    }
    
    public double arredonda(double valor, int casa){
        BigDecimal bd = new BigDecimal(valor).setScale(casa, RoundingMode.HALF_UP);
//System.out.println(bd.doubleValue());
        return bd.doubleValue();
    }

    public void discancia( double lat1, double lon1, double lat2, double lon2) {
       final int R = 6371; // Radius of the earth
     
        Double latDistance = (Math.toRadians(lat2) - Math.toRadians(lat1));
        Double lonDistance = (Math.toRadians(lon2) - Math.toRadians(lon1));
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        distance = Math.pow(distance, 2);     
        retorno =arredonda( Math.sqrt(distance),2);
        System.out.println( "A distancia entre os pontos ("+lat1+", "+lon1+") e ("+lat2+", "+lon2+ ") e de "+retorno+" km");
    }
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lat1 = scan.nextDouble();
        double lon1 = scan.nextDouble();
        double lat2 = scan.nextDouble();
        double lon2 = scan.nextDouble();
        RotaOrtodromica rota = new RotaOrtodromica();
        rota.discancia(lat1, lon1, lat2, lon2);
        //rota.discancia(28.485867, -80.544439, -3.088144, -59.964330);
    
    }
}

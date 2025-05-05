// guardara los datos obtenidos del json de monda base, moneda objetivo, cantidad a convertir y resultado de la convercion
// ejemplo USD,MXN,1.00,19.00
public record Moneda(String base_code, String target_code, double conversion_rate, double conversion_result) {

}



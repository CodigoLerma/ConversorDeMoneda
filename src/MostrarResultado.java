public class MostrarResultado {



    public void resultado (String monedaBase, String monedaObjetivo, double cantidad){
        ConsultarMoneda consulta = new ConsultarMoneda();
        Moneda moneda = consulta.tipoDeMoneda(monedaBase,monedaObjetivo,cantidad);
        System.out.println("La conversion de: " + cantidad + " "+ "["+ monedaBase + "]");
        System.out.println("a " + "[" + monedaObjetivo + "]" + " es: " + moneda.conversion_result());




    }






}

public class MostrarResultado {


    // mostrara el resultado de las monedas seleccionadas
    public void resultado (String monedaBase, String monedaObjetivo, double cantidad){
        ConsultarMoneda consulta = new ConsultarMoneda();
        Moneda moneda = consulta.tipoDeMoneda(monedaBase,monedaObjetivo,cantidad); // enviara los datos de resultado para llamar a la api

        //mostrar mensaje de la conversion realizada
        System.out.println("La conversion de: " + cantidad + " "+ "["+ monedaBase + "]");
        System.out.println("a " + "[" + monedaObjetivo + "]" + " es: " + moneda.conversion_result());




    }






}

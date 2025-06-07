import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaAPI consultaAPI = new ConsultaAPI();
        CrearArchivo crearArchivo = new CrearArchivo();
        Menu menu = new Menu();
        
        int opcion = menu.obtenerOpcion();
        double valorAConvertir = menu.obtenerValorAConvertir();

        String conversor = menu.tipoConversor(opcion);
        String[] monedas = conversor.split("/");

        String consultaJson = consultaAPI.obtenerDatos(conversor);
        Consulta consulta = crearArchivo.JsonToConsulta(consultaJson);

        crearArchivo.GuardarEnJson(consulta);

        double tasaDeConversion = consulta.conversion_rate();
        double valorCovertido = valorAConvertir * tasaDeConversion;

        System.out.println("El valor " + valorAConvertir + " " + monedas[0] + " al valor final de =>>> " + valorCovertido + " " + monedas[1]);
    }
}

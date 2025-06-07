import java.util.Scanner;


public class Menu {
    private final Scanner scan = new Scanner(System.in);

    public int obtenerOpcion() {
        int opt = 0;
        while (opt != 7){
            System.out.println("**************************");
            System.out.println("Conversor de monedas .SAS");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");
            System.out.print("Elije una opción válida: ");
            opt = scan.nextInt();
            if (opt >= 1 && opt <= 6) {
                return opt;
            }
            else {
                System.out.println("Ingresa una opción valida!");
                break;
            }
        }
        return opt;
    }
    public Double obtenerValorAConvertir(){
        double valorAConvertir = 0.0;

        System.out.println("\nIngresa el valor que deseas convertir: ");
        valorAConvertir = scan.nextDouble();

        return valorAConvertir;
    }

    public String tipoConversor(int opt){
        String tipoConversor = "";
        if(opt == 1){
            tipoConversor = "USD/ARS";
        }else if(opt == 2){
            tipoConversor = "ARS/USD";
        }else if(opt == 3){
            tipoConversor = "USD/BRL";
        }else if(opt == 4){
            tipoConversor = "USD/BRL";
        }else if(opt == 5){
            tipoConversor = "USD/COP";
        }else if(opt == 6){
            tipoConversor = "COP/USD";
        }
        return tipoConversor;
    }
}

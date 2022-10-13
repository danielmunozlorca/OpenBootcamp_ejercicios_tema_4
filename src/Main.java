public class Main {

     // parte 1 del ejercicio If
        public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("es negativo");
        } else if (numeroIf == 0) {
            System.out.println("es cero");
        } else  {
            System.out.println("es positivo");
        }
    }
} 

/*    // parte 2 del ejercicio While

    public static void main(String[] args) {
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
    }
} */

 /*    // parte 3 del ejercicio Do While

    public static void main(String[] args) {
        int numeroWhile = 3;

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);  //con esto ejecuta solo 1 vez
    }
} */

/*    // parte 4 del ejercicio - For

    public static void main(String[] args) {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
    }
} */

/*   // parte 5 del ejercicio - Switch

    public static void main(String[] args) {
        var estacion = "INVIERNO";

        switch (estacion) {
            case "VERANO":
                System.out.println("NO ES INVIERNO, ES VERANO");
                break;
            case "OTOÑO":
                System.out.println("NO ES INVIERNO, ES OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO, HAY QUE ABRIGARSE");
                break;
            case "PRIMAVERA":
                System.out.println("NO ES INVIERNO, ES PRIMAVERA");
                break;
            default:
                System.out.println("NO ES UNA ESTACION");
        }
    }
} */
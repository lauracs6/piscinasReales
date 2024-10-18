import java.util.Scanner;

public class CabreraS {
    public static void main(String[] args) {
          
        Scanner teclado = new Scanner(System.in);

        double largo1 = 300.3;
        double largo2 = 300.3;

        
        System.out.println("Introduzca el ancho1: ");
        double ancho1 = teclado.nextDouble();
        System.out.println("El ancho1 es: " + ancho1);

        System.out.println("Introduzca la profundidad1: ");
        double profundidad1 = teclado.nextDouble();
        System.out.println("La profundidad1 es: " + profundidad1);

        System.out.println("Introduzca el ancho2: ");
        double ancho2 = teclado.nextDouble();
        System.out.println("El ancho2 es: " + ancho2);

        System.out.println("Introduzca la profundidad2: ");
        double profundidad2 = teclado.nextDouble();
        System.out.println("La profundidad2 es: " + profundidad2);



       
        double area1 = ancho1 * largo1;  //área de la piscina 1
        int areaEntero1 = (int) area1;
        double area2 = ancho2 * largo2;  //área de la piscina 2
        int areaEntero2 = (int) area2;
        
      
        double volumen1 = area1 * profundidad1;  //volumen de la piscina 1
        int volumenEntero1 = (int) volumen1;
        
        double volumen2 = area2 * profundidad2;  //volumen de la piscina 2
        int volumenEntero2 = (int) volumen2;
        
      
        double anchoTotal = ancho1 + ancho2; //ancho de las dos piscinas juntas
        int anchoTotalEntero = (int) anchoTotal;
      
        double areaTotal = anchoTotal * largo1;  //área de las dos piscinas juntas
        int  areaTotalEntero = (int) areaTotal;
        
          
        double volumenTotal = volumen1 + volumen2; //volumen de las dos piscinas juntas
        int volumenTotalEntero = (int) volumenTotal;
        
      
        System.out.println("El área de la piscina 1 es: " + areaEntero1 + " m²"); //muestra de resultados
        System.out.println("El área de la piscina 2 es: " + areaEntero2 + " m²");
        System.out.println("El volumen de la piscina 1 es: " + volumenEntero1 + " m³");
        System.out.println("El volumen de la piscina 2 es: " + volumenEntero2 + " m³");
        System.out.println("El ancho total de ambas piscinas es: " + anchoTotalEntero + " m");
        System.out.println("El área total de las dos piscinas es: " + areaTotal + " m²");
        System.out.println("El volumen total de las dos piscinas es: " + volumenTotal + " m³");
      
        double temp = profundidad1;  //intercambio de datos entre piscinas
        profundidad1 = profundidad2;
        profundidad2 = temp;
        
        volumen1 = area1 * profundidad1;  //volumen de la piscina 1 con los datos cambiados
        int volumenEntero1Nuevo = (int) volumen1;
        volumen2 = area2 * profundidad2;  //volumen de la piscina 2 con los datos cambiados
        int volumenEntero2Nuevo = (int) volumen2;
      
        System.out.println("El nuevo volumen de la piscina 1 es: " + volumenEntero1Nuevo + " m³"); //muestra de los nuevos resultados
        System.out.println("El nuevo volumen de la piscina 2 es: " + volumenEntero2Nuevo + " m³");
        }
    }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedioGrupo {

    //Declarando variables globales
    public static BufferedReader bufer =new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    //declaracion de de un arreglo de tipo tda
    public static Alumnos [] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;

        System.out.println("Solicitando la informacion del estudiante");
        for (int i = 0; i < alumnos.length; i++){
            System.out.println("------------------------------------------");
            System.out.println("Escribe la matricula");
            entrada = bufer.readLine();
            matricula= entrada;
            System.out.println("Escribe el nombre");
            entrada = bufer.readLine();
            nombre= entrada;
            //Creacion de un objeto Alumno (POJO)
            Alumnos a = new Alumnos(matricula, nombre);
            System.out.println("Escribe calficacion de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calficacion de ingles: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe calficacion de iot: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));

        }
    }

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
        
        // double [] calificaciones; //calificaciones de cada alumno
        // double suma =0; //para sumar las calificaciones
        // double promedio; //promedio del grupo
        



        System.out.println("Programa para calcular promedio de un grupo");
        System.out.println("------------------------------------------------");
        //recuperando el tamaño del grupo
        System.out.println("Escribe el numero de alumnos en el grupo");
        entrada =bufer.readLine();//lectura del teclado
        n = Integer.parseInt(entrada);//Conversion de String a int

        //Construiur el arreglo alumnos
        alumnos = new Alumnos[n];


        // calificaciones = new double[n];//costruccion del arreglo

        //pedir cada calificaciones y acumularlas
        // for(int i = 0; i< calificaciones.length; i++){
        //     System.out.println("Escribe la calificacion del estudiante [" + (i+1) + "]:");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }

        //obtener el promedio
        // promedio = suma / n;

    //     System.out.println("---------------------------------------------------");
    //     System.out.println("Las calificaciones de cada alumno son: ");
    //     for(double califi : calificaciones){
    //         System.out.println(califi);
    //     }
    //     System.out.println("---------------------------------------");
    //     System.out.println("El promedio de grupo es: " + promedio);
    // }
}
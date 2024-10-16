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
            a.setPromedio();
            //agregando un alumno al arreglo
            alumnos[i] = a;

        }
    }

    public static void imprimirAlumnos(){
        System.out.println("Contenido del arreglo Alumnos: ");
        for(Alumnos a : alumnos){
            System.out.println("-------------------------------------------");
            System.out.println("Información del alumno: ");
            System.out.println(a.toString());
        }
    }

    public static double calcularPromedio(){
        double suma = 0;
        for(Alumnos a : alumnos){
            suma += a.getPromedio();
        }
        return (suma / alumnos.length);
    }

    public static double promedioE(){
        double suma = 0;
        for(Alumnos a : alumnos){
            suma += a.getEstructuras();
        }
        return (suma / alumnos.length);
    }
    public static double promedioI(){
        double suma = 0;
        for(Alumnos a : alumnos){
            suma += a.getIngles();
        }
        return (suma / alumnos.length);
    }public static double promedioIO(){
        double suma = 0;
        for(Alumnos a : alumnos){
            suma += a.getIot();
        }
        return (suma / alumnos.length);
    }

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
        double promedio, promedio1,promedio2,promedio3; //promedio del grupo

        System.out.println("Programa para calcular promedio de un grupo");
        System.out.println("------------------------------------------------");
        //recuperando el tamaño del grupo
        System.out.println("Escribe el numero de alumnos en el grupo");
        entrada =bufer.readLine();//lectura del teclado
        n = Integer.parseInt(entrada);//Conversion de String a int

        //Construiur el arreglo alumnos
        alumnos = new Alumnos[n];
        //Intruducir informcion de los alumnos
        leerAlumnos();
        //Mostrar informacion
        imprimirAlumnos();
        //obtener el promedio
        promedio = calcularPromedio();
        //obtener promedio por mataria
        promedio1 = promedioE();
        promedio2 = promedioI();
        promedio3 = promedioIO();


        System.out.println("---------------------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
        System.out.println("El promedio de Estructuras es: " + promedio1);
        System.out.println("El promedio de Ingles es: " + promedio2);
        System.out.println("El promedio de IOT es: " + promedio3);


    }
}

package colas;

public class Main {

public static void main(String[] args) {

Colas cola=new Colas();
cola.insertar(46);
cola.insertar(12);
cola.insertar(87);
cola.insertar(125);
cola.insertar(30);

System.out.println("<<-- Tamanio -->>");
cola.contar();
System.out.println("Cola: " + cola.toString());
System.out.println("\n<<-- Retirar el primer elemento de la Cola -->>"+ "\n");
cola.extraer();
System.out.println("<<-- Tamanio -->>" );
cola.contar();
System.out.println("Cola: " + cola.toString()+ "\n");
cola.estaVacia();
System.out.println();
System.out.println("<<-- Tamanio -->>");
cola.contar();
System.out.println("Cola: " + cola.toString());
}
}
   


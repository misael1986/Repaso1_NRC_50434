public class Main {
    public static void main(String[] args) {

       int C[]= new int[50];//Integer short
        int valor1=237;
        System.out.println(valor1 % 50);
        int i=valor1 % 50;

       C[i]=valor1;

       for(int j=0;j<C.length;j++){
           System.out.println("C["+j+"] = "+C[j]);
       }



       Nodo raiz=new Nodo();
        raiz.valor=10;
        raiz.siguiente=null;

        Nodo nodo1=new Nodo(23,null);

        Persona persona=new Persona();
        persona.setNombre("Misael");
        System.out.println(persona.getNombre());


        Estudiante estudiante=new Estudiante();
        estudiante.setNombre("Jovanny");
        System.out.println(estudiante.getNombre());

    }
}
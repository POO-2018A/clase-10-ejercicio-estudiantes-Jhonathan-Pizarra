
package estudiante;


public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante [] alumno = new Estudiante[3]; //Un arreglo de objetos, de 5 objetos
        
        alumno[0] = new Estudiante("Jhonathan Pizarra", 1725358525);
        alumno[1] = new Estudiante("Xavier Chirioga", 1725353426);
        alumno[2] = new Estudiante("Elizabeth Vásconez", 1722583625);
     //  alumno[3] = new Estudiante("Miranda Minaya", 1725368575);
     //  alumno[4] = new Estudiante("Bryan Ubuntu", 1725348575);
        
        /*
        //Declarar un arreglo (No de objetos)
        String [] materia = new String[5]; 
        //Inicializar un arreglo (Cada posicion tendra un dato.. (Una materia para cada posicion)
        materia[0] = "Fisica";
        materia[1] = "Quimica";
        //etc...
        o...
        //Declarar e inicializar
        String [] materia = {"Fisica", "Álgebra", "Programación","Lenguaje"}; 
            */
        //Deber:
        //.........
       // String [] materias = {"Física", "Álgebra"};
        /*
       alumno[0].setMaterias(materias); //Le estamos mandando un arreglo de Materias al objeto alumnos de la posicion 0 (No me dice cual es el contenido de ese arreglo)
        
        //Alojar en el alumno 0 las materias...
       String [] materiaEstudiante = alumno[0].getMaterias(); //¿Qué estoy haciendo en esta linea de código? //Se explica en alumno[1]
       
      // System.out.println("Materias E1: "+alumno[0].getMaterias()); //Me sigue dando error.... Porque ya me mandó como Arreglo y eso no se puede imprimir como String
                                                                        //Sino se debe imprimir como arreglo... mediante un bucle...Creo..        
       System.out.println("Materias: ");
       int indice = 1;
       for(int i = 0; i < materiaEstudiante.length; i++ ){ //¿Qué hace este bucle exacamente? 
                                                            // dice que el iterador es igual a cero, minetras este sea menor a la cantidad de materias, ejecute lo de abajo y aumente 1...
                    
           System.out.println(indice+".-"+materiaEstudiante[i]+" "); 
           indice++;
       }
         
       //........... 
        String [] materias2 = {"Física", "Álgebra","Quimica"};
        alumno[1].setMaterias(materias2); //Le estamos mandando un arreglo de Materias al objeto alumnos de la posicion 1 (No me dice que materias)
        
       String [] materiaEstudiante2 = alumno[1].getMaterias(); //En esta linea de codigo lo que estoy haciendo es alojar las materia de mi objeto de la posicion tal...
                                                                //Aqui si me dice cual es el contenido que alojaré en ese objeto
       System.out.println("Materias: ");
       int indice2 = 1;
       for(int i = 0; i < materiaEstudiante2.length; i++ ){ 
           
           System.out.println(indice2+".-"+materiaEstudiante2[i]+" "); 
           indice2++;
       }
      
       //..........
        String [] materias3 = {"Física", "Álgebra","Quimica","Lenguaje","Programación"};
        //(y) //El alumno 2 tiene colocadas 5 materias (una cantidad de 5 elementos )
        alumno[2].setMaterias(materias3); //Le estamos mandando un arreglo de Materias al objeto alumnos de la posicion 1 (No me dice que materias)
      
        //(x) El tamaño del arreglo de materias para este alumno2 es que esta seteado allí arriba (y)
       String [] materiaEstudiante3 = alumno[2].getMaterias(); //En esta linea de codigo lo que estoy haciendo es alojar las materia de mi objeto de la posicion tal...
                                                                //Aqui si me dice cual es el contenido que alojaré en ese objeto
       System.out.println("Materias: ");
       int indice3 = 1;
       for(int i = 0; i < materiaEstudiante3.length; i++ ){ //Minetras que i sea menor que el tamaño del arreglo de materias que hay para el alumno 2 (x)
           
           System.out.println(indice3+".-"+materiaEstudiante3[i]+" "); 
           indice3++;
       }
                */
       //En resumen, desde la linea alumno[2].setMaterias, estoy colocando que voy a pasar un arreglo con 5 materias
       //Luego en materiasEstudiante3 estoy diciendo que ese estudiante[2] tenga acceso a las materias, a esas 5 materias: Fisica, Algebra
        //Otra forma de hacer es...
        int indiceEstudiante = 1;
        int acumulador = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;
        int acumulador4 = 0;
        int acumulador5 = 0;
       for(int i = 0; i < alumno.length; i++){
           System.out.println("##Estudiante"+" "+indiceEstudiante);
           System.out.println("Nombre Completo: "+alumno[i].getNombre());
           System.out.println("Cédula: "+alumno[i].getCedula());
           
           if(i == 0){
               String [] materias = {"Física", "Álgebra"};
               alumno[i].setMaterias(materias);
           }else if(i == 1){
               String [] materias = {"Física", "Álgebra","Quimica"};
               alumno[i].setMaterias(materias);
           }
           else if (i == 2){
               String [] materias = {"Física", "Álgebra", "Quimica", "Lengua", "Programación"};
               alumno[i].setMaterias(materias);
           
           }
            String[] materiasEstudiantes = alumno[i].getMaterias();
            System.out.println("Materias: ");
            int indiceMaterias = 1;
            for(int j = 0; j < materiasEstudiantes.length; j++){
               System.out.println(indiceMaterias+".-"+materiasEstudiantes[j]);
               if(materiasEstudiantes[j].equals("Física")){
               acumulador++;
               }else if(materiasEstudiantes[j].equals("Álgebra")){
               acumulador2++;
               }
               else if(materiasEstudiantes[j].equals("Quimica")){
               acumulador3++;
               }
               else if(materiasEstudiantes[j].equals("Lengua")){
               acumulador4++;
               }
                else if(materiasEstudiantes[j].equals("Programación")){
               acumulador5++;
               }
               indiceMaterias++;
            }
          
           indiceEstudiante++;   
       
       }
        System.out.println("");
        System.out.println("### RESUMEN DE MATERIAS ###");
        
        System.out.println("Fisica: "+acumulador);
        System.out.println("Algebra: "+acumulador2);
        System.out.println("Química: "+acumulador3);
        System.out.println("Lenguaje: "+acumulador4);
        System.out.println("Programación "+acumulador5);
        
    }
    
}

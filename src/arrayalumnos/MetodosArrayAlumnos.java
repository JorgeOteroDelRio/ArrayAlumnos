/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayalumnos;
import javax.swing.JOptionPane;
/**
 *
 * @author Jota
 */
public class MetodosArrayAlumnos {
    private final static int[] notas = new int[pedirTamanho()];
    private final static String[] nomes =new String[notas.length];
    
    public static int pedirTamanho(){
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Numero de alumnos:"));
        return numElementos;
    }
    
    public static String pedirNome(){
        return JOptionPane.showInputDialog("Nombre alumno:");
    }
    
    public static int pedirNota(){
        return Integer.parseInt(JOptionPane.showInputDialog("Nota alumno:"));
    }
    
    public static void cargarArray(){
        for(int i=0;i<notas.length;i++){
            nomes[i]=pedirNome();
            notas[i]=pedirNota();
        }
    }
    
    public static void visualizar(){
        String texto="";
        for(int i =0;i<nomes.length;i++){
            texto+=nomes[i]+"---> " + notas[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void consultarNota(){
        boolean notFound=true;
        String nome = pedirNome();
        for(int i=0;i<nomes.length;i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                JOptionPane.showMessageDialog(null, "La nota de " + nomes[i] + " es " + notas[i]);
                notFound=false;
                //break;
            }
        }
        
        if(notFound){
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        }
    }
    
    public static void ordenarArray(){
        int aux;
        String aux2;
        for(int i=0;i<notas.length-1;i++){
            for(int j=i+1;j<notas.length;j++){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                    aux2=nomes[i];
                    nomes[i]=nomes[j];
                    nomes[j]=aux2;
                }
            }
        }
    }
    
    public static void lanzarMenu(){
        MetodosArrayAlumnos obx = new MetodosArrayAlumnos();
        boolean condicion=true;
        do{
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1)Guardar notas de alumnos.\n"
        + "2)Visualizar notas.\n3)Consultar nota de alumno.\n4)Ordenar lista de menor a mayor nota.\n5)Salir"));
        switch(opcion){
            case 1:
                obx.cargarArray();
                break;
            case 2:
                obx.visualizar();
                break;
            case 3:
                obx.consultarNota();
                break;
            case 4:
                obx.ordenarArray();
                break;
            case 5:
                condicion=false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Introduzca una opción válida.");
        }
        }while(condicion);
        
    }
    
}

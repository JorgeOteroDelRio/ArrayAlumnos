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
    int[] notas = new int[pedirTamanho()];
    String[] nomes =new String[notas.length];
    
    public int pedirTamanho(){
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Tamaño array:"));
        return numElementos;
    }
    
    public String pedirNome(){
        return JOptionPane.showInputDialog("Nombre alumno:");
    }
    
    public int pedirNota(){
        return Integer.parseInt(JOptionPane.showInputDialog("Nota alumno:"));
    }
    
    public void cargarArray(){
        for(int i=0;i<notas.length;i++){
            nomes[i]=pedirNome();
            notas[i]=pedirNota();
        }
    }
    
    public void visualizar(){
        String texto="";
        for(int i =0;i<nomes.length;i++){
            texto+=nomes[i]+"---> " + notas[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void consultarNota(){
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
    
    public void ordenarArray(){
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
    
}

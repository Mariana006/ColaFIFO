package colafifo;
//clase cola
import java.util.Scanner;
public class Fifo {
    Scanner entrada=new Scanner (System.in);
   Cola inicio;
   Cola fin;
   
   //metodo constructor
   public Fifo(){
       inicio=null;
       fin=null;
   }
   //metodo insertar
   public void insertar(){
       Cola dn=new Cola();
       System.out.print("ingrese el dato");
       dn.dato= entrada.nextInt();
  if(inicio==null){
      inicio=dn;
      inicio.sig=null;
      fin=dn;      
  }
  else{
      fin.sig=dn;
      dn.sig=null;
      fin=dn;
  }
  System.out.print("Dato ingresado");
   }
   public void desplegar(){
       Cola uno=new Cola();
       uno= inicio;    
        if(inicio !=null){
    while(inicio !=null){
        System.out.print(""+inicio.dato);
    }
}
        else{
            System.out.print("----- Cola Vacia -----");
        }
   }
  
}

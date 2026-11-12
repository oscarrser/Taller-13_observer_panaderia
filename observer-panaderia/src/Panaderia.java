import java.util.ArrayList;

public class Panaderia implements  Observable {
    private boolean hayPan = false;
    private ArrayList<Vecino> vecinoSuscritos = new ArrayList<Vecino>();

    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
        notificar( "¡Ya salio el pan caliente");
    }

   @Override 
   public void suscribir(Vecino v) {
    vecinoSuscritos.add(v);
   }

   
   @Override 
   public void desuscribir(Vecino v) {
    vecinoSuscritos.add(v);
   }

   
   @Override 
   public void notificar(String mensaje) {
    for (Vecino v : vecinoSuscritos) {
        v.actualizar(mensaje);
    }
    
   }
}


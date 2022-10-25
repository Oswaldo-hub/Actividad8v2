import com.sun.source.tree.DoWhileLoopTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class deck  {
public final ArrayList <card> mazo;


    public deck() {
       mazo = new ArrayList<card>();
        for (int i=0;i<card.palo2.length;i++){
            if(i>1){break;}
            for (int n=0;n<card.color2.length;n++){
                if(n>0){break;}
                for (int j=0;j< card.valor2.length;j++){
                    mazo.add(new card(card.palo2[i] , card.color2[n],card.valor2 [j]) );


                }

            }
            System.out.println("\n ");
        }
        for (int i=2;i< card.palo2.length;i++){

            for (int n=1;n<card.color2.length;n++){

                for (int j=0;j< card.valor2.length;j++){
                    mazo.add(new card(card.palo2[i] , card.color2[n],card.valor2 [j]) );


                }

            }

        }

}
public  void shuffle(){
        Collections.shuffle(mazo);
        System.out.println("Se ha mezclado el deck");
        System.out.println("---------------------");
}
 public void head()throws  Exception{
     Collections.shuffle(mazo);
     System.out.println("La primer carta es:  "+ mazo.get(0));
     System.out.println(mazo.remove(0));
     System.out.println("quedan 51 cartas");
     System.out.println("---------------------");
     if(mazo == null){throw new IndexOutOfBoundsException();}
 }

 public void pick() throws Exception {

      int vrandom = 51;
     int ramdon_final = (int) (Math.random() * vrandom);

     System.out.println("tu carta es:  "+ mazo.get(ramdon_final));
     mazo.remove(ramdon_final);
            System.out.println("Quedan: " +  (52 - 1));
     System.out.println("---------------------");
     if(mazo == null){throw new IndexOutOfBoundsException();}


 }
 public void  hand() throws  Exception{
        System.out.println("Tu mano es: ");
        for(int i = 0;i<51;i++){

            int vrandom = 51;
            int ramdon_final = (int) (Math.random() * vrandom);
            System.out.println(""+ mazo.get(ramdon_final));
            if(i==4){break;}
            mazo.remove(ramdon_final);
            if(mazo == null){throw new IndexOutOfBoundsException();}

        }

     System.out.println("---------------------");
 }

}



import java.awt.image.IndexColorModel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {



showmenu();
    }

    public  static   void showmenu() throws  Exception{
        Scanner entrada = new Scanner(System.in);
        deck d = new deck();

        System.out.println("Bienvenido al juego de poker presiona los siguientes numeros, para lo que quieras realizar: "+"\n "
                +"1: Revolver el deck"+"\n "
                +"2: Sacar la primer carta del deck"+"\n "
                +"3: Sacar una carta al azar"+"\n "
                +"4: Sacar una mano del deck"+"\n "
                +"0: Sailr"+"\n ");
        try { int respuesta;
        respuesta = entrada.nextInt();



           if (respuesta == 1) {
               d.shuffle();
               int respuesta2;
               System.out.println("Presiona 1 para volver al menu" + "\n " +
                       "Presiona cualquier otro numero para salir del juego");
               respuesta2 = entrada.nextInt();
               while (respuesta2 != 1) {
                   System.out.println("Gracias por jugar");
                   break;
               }
               if (respuesta2 == 1) {
                   showmenu();

               }
           } else if (respuesta == 2) {
               d.head();
               int respuesta2;
               System.out.println("Presiona 1 para volver al menu" + "\n " +
                       "Presiona cualquier otro numero para salir del juego");
               respuesta2 = entrada.nextInt();
               while (respuesta2 != 1) {
                   System.out.println("Gracias por jugar");
                   break;
               }
               if (respuesta2 == 1) {
                   showmenu();

               }

           } else if (respuesta == 3) {
               d.pick();
               int respuesta2;
               System.out.println("Presiona 1 para volver al menu" + "\n " +
                       "Presiona cualquier otro numero para salir del juego");
               respuesta2 = entrada.nextInt();
               while (respuesta2 != 1) {
                   System.out.println("Gracias por jugar");
                   break;
               }
               if (respuesta2 == 1) {
                   showmenu();

               }

           } else if (respuesta == 4) {
               d.hand();
               int respuesta2;
               System.out.println("Presiona 1 para volver al menu" + "\n " +
                       "Presiona cualquier otro numero para salir del juego");
               respuesta2 = entrada.nextInt();
               while (respuesta2 != 1) {
                   System.out.println("Gracias por jugar");
                   break;
               }
               if (respuesta2 == 1) {
                   showmenu();

               }

           } else if (respuesta == 0) {
               System.out.println("has salido del menu. ");

           }  while ((respuesta < 0) || (respuesta > 4)) {
               throw new IllegalArgumentException("");




           }  }
        catch (InputMismatchException e)  {
            System.out.println("Opcion no valida Debes escribir un numero" );

showmenu();
        } catch (IllegalArgumentException e) {
            System.out.println("Esta opcion no existe");
            showmenu();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El deck esta vacio se han agotado las cartas");
            showmenu();
        }


    }

}

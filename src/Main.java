//probando sincronizacion con itelliJ IDEA
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws Exception{
        /*
        //Codigo solo usando main class
        String nombre = "Movies.txt", letter;
        Scanner scanner = new Scanner(new File(nombre));
        Scanner sc = new Scanner(System.in);
        int puntaje = 10;
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine())arrayList.add(scanner.nextLine());
        int count = (int) (Math.random()*arrayList.size());
        String[] movie = new String[arrayList.get(count).length()];
        System.out.println(arrayList.get(count));
        for (int i = 0; i < arrayList.get(count).toCharArray().length; i++){
            if (arrayList.get(count).toCharArray()[i] == ' '){
                System.out.print((movie[i] = " "));
            }else {
                System.out.print((movie[i] = "-") + " ");
            }
        }
        System.out.println();
        while(true){
            System.out.println("puntaje " + puntaje);
            if (puntaje == 0){
                System.out.println("Perdiste");
                break;
            }
            System.out.println("Ingresa una letra");
            letter = sc.nextLine();
            int l1;
            if (!arrayList.get(count).contains(letter)){
                puntaje--;
                System.out.println("Letra erronea");
                System.out.println(String.join("",movie));
                continue;
            }
            for (int x = 0; x < arrayList.get(count).length();x++){
                l1 = arrayList.get(count).indexOf(letter, x);
                if (l1 != -1){
                    if (arrayList.get(count).contains(letter)){
                        movie[l1] = letter;
                    }
                }
            }
            System.out.println(String.join("",movie));
            if(String.join("",movie).equals(arrayList.get(count))){
                System.out.println("Ganaste");
                break;
            }
        }*/

        //Codigo usando una clase Juego para un codigo mas limpio
        String nombre = "Movies.txt", movie, letter;
        Scanner scanner = new Scanner(new File(nombre));
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int i = 0;
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
            System.out.println(list.get(i));
            i++;
        }
        System.out.println();
        int count = (int) (Math.random()*list.size());
        movie = list.get(count);
        Juego juego = new Juego(movie);
        System.out.println(movie);
        //System.out.println(movie);
        String[] movieU = juego.underScoreMovie();
        while (true){
            System.out.println("puntaje " + juego.getPuntaje());
            if (juego.getPuntaje() == 0){
                System.out.println("Perdiste");
                break;
            }
            System.out.println("Ingresa una letra");
            letter = sc.nextLine();
            int l1;
            if (!juego.getMoviesName().contains(letter)){
                juego.setPuntaje(juego.getPuntaje()-1);
                System.out.println("Letra erronea");
                System.out.println(String.join("",movieU));
                continue;
            }
            for (int x = 0; x < juego.getMoviesName().length();x++){
                l1 = juego.getMoviesName().indexOf(letter, x);
                if (l1 != -1){
                    if (juego.getMoviesName().contains(letter)){
                        movieU[l1] = letter;
                    }
                }
            }
            System.out.println(String.join("",movieU));
            if(String.join("",movieU).equals(juego.getMoviesName())){
                System.out.println("Ganaste");
                break;
            }
        }
    }

}

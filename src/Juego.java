public class Juego {
    private String moviesName;
    private int puntaje;

    Juego(String moviesName){
        this.moviesName = moviesName;
        this.puntaje = 10;
    }
    public int getPuntaje(){
        return this.puntaje;
    }
    public String getMoviesName(){
        return moviesName;
    }
    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }

    public String[] underScoreMovie(){
        String [] nameM = new String[this.moviesName.length()];
        for (int i = 0; i < this.moviesName.length();i++){
            if (this.moviesName.toCharArray()[i] == ' '){
                System.out.print((nameM[i] = " "));
            }else {
                System.out.print((nameM[i] = "-") + " ");
            }

        }
        return nameM;
    }


}

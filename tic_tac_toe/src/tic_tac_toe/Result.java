package tic_tac_toe;

public class Result {
    private int width, height, distance;
    private String[] array;

    public Result (int width,int height, int distance) {
       this.width = width;
       this.height = height;
       this.distance = distance;
    }
    public void process (String[] array) {  // смотрит сколько крестиков/ноликов в ряде
    this.array = array;

    for (int y = 0; y<height; y++) {  //проход по всем точкам (8 точек) массива
        for(int x = 0; x<height; x++) {


            for (int b = -1; b<=1; b++) {
                for(int a = -1; a<=1; a++) {
                    if(!(a==0 && b==0)) {

                      if  (check(x,y,a,b, "X")) {
                          System.out.println("X"); }
                      if  (check(x,y,a,b, "0")) {
                          System.out.println("0"); }

                    }


                }
            }
        }

    }
    }

    public boolean check(int x, int y, int a, int b, String symbol) {
        for(int i = 0; i<distance; i++) {
            int index = border(x + a*1, y + b*1);
            if(index == -1) {return false; }
            else {if(array[index] != symbol) {
                return false;} }

        }
        return true;
    }
    public int border (int x, int y) {  // ограничение координат
        if(x>0 && x<width && y>=0 && y<height) {
            return y*width + x; //перевод координат в одномерную величину

        }
        return -1;
    }
}

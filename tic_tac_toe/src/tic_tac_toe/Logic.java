package tic_tac_toe;

public class Logic {
    public int side = 3;
    public int length = side*side;
    public String[] array = new String[length];
    Result result = new Result(side,side, 3);



    public boolean write(int index, String symbol) { //проверка пустая ли клеточка для интеллекта
        if(array[index] == null) {
            return true;
        }
        else {
            return false;
        }
        //return true;
    }
    public boolean write_player(int index, String symbol) // проверка пустая ли клеточка для игрока
    {
        if(array[index] == null) {
            array[index] = symbol;

        }
        else {
            return false;
        }
        return true;
    }

    public boolean positionUser (int index) {
      return write_player(index, "0");

    }
    public boolean positionPC() {  // настройка иск интеллекта

        result.process(array);

        int index = (int) (Math.random()*9);
        if(write(index, "X"))
        {
            array[index] = "X";
        }
        else
        {
            for(int i =0;i<array.length;i++)
            {
                if(array[i] == null)
                {
                    array[i] = "X";
                    return false;
                }
            }
        }

        return false;
    }
}

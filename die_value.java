public class die_value {
    public int die_value(){
        int die = (int)(Math.random()*6) + 1;
        return die;
    }
    public int options(){
        int opt = (int)(Math.random()*3);
        return opt;
    }
    public int claculate_postion(int options1,int position_of_the_player1){
        switch (options1) {
            case 0 -> position_of_the_player1 += 0;
            case 1 -> position_of_the_player1 += options1;
            case 2 -> position_of_the_player1 -= options1;
        }
        return position_of_the_player1;
    }
}

public class main {
public static void main(String[] args){
    // uc5
    System.out.println("Snake and ladder Simulator!");
    // uc1 initial_position is 0
    int position_of_the_player = 0;
    // 0 for no play
    // 1 for ladder
    // 2 for snake

    // runs till player reaches to 100;
    boolean loop = true;
    int no_of_chances = 0;
    while(loop){
        if(position_of_the_player == 100) {
            break;
        }
        int die = (int)(Math.random()*6) + 1;
        int options = (int)(Math.random()*3);

        int temp = position_of_the_player; // storing the prev position of the player
        switch (options) {
            case 0 -> position_of_the_player += 0;
            case 1 -> position_of_the_player += options;
            case 2 -> position_of_the_player -= options;
        }

        if(position_of_the_player > 100) {
            // sets the same value if the player get more than 100
            position_of_the_player = temp;
        }
        if (position_of_the_player < 0) {
            // set the value to 0
            position_of_the_player = 0;
        }
        no_of_chances += 1;
        System.out.println("updated position of the player : " + position_of_the_player);
    }
    System.out.println(" No of games played by the player : " + no_of_chances);
}
}

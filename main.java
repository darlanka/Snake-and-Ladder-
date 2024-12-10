



public class main {
public static void main(String[] args){
    // uc7
    System.out.println("Snake and ladder Simulator!");
    // uc7 initial_position is 0
    int position_of_the_player1 = 0;
    int position_of_the_player2 = 0;

    // creating the die vlaue object
    die_value die = new die_value();
    // options for the player
    // 0 for no play
    // 1 for ladder
    // 2 for snake

    boolean loop = true;
    int no_of_chances1 = 0;
    int no_of_chances2 = 0;
    int winner = -1;

    // runs till player reaches to 100;
    while(loop){
        if(position_of_the_player1 == 100) {
            winner = 1;
            break;
        }
        if(position_of_the_player2 == 100){
            winner = 2;
            break;
        }
        int die1 = die.die_value();
        int die2 = die.die_value();
        int options1 = die.options();
        int options2 = die.options();

        int temp1 = position_of_the_player1; // storing the prev position of the player
        int temp2 = position_of_the_player2;

        // for first round
        position_of_the_player1 = die.claculate_postion(options1,position_of_the_player1);
        // if the he got ladder we need to run a loop until he goes down

        while(options1 == 2){
            temp1 = position_of_the_player1;
            options1 = die.options();
            position_of_the_player1 = die.claculate_postion(options1,position_of_the_player1);
            // if the position is greater than 100 set previous value ;
            if(position_of_the_player1 > 100){
                position_of_the_player1 = temp1;
            }
            // if current position is less than 0 then set it to 0
            if(position_of_the_player1 < 0) position_of_the_player1 = 0;
        }

        position_of_the_player2 = die.claculate_postion(options2,position_of_the_player2);

        while(options2 == 2){
            temp2 = position_of_the_player2;
            options2 = die.options();
            position_of_the_player2 = die.claculate_postion(options2,position_of_the_player2);
            // if the position is greater than 100 set previous value ;
            if(position_of_the_player2 > 100){
                position_of_the_player2 = temp2;
            }
            // if current position is less than 0 then set it to 0
            if(position_of_the_player2 < 0) position_of_the_player2 = 0;
        }

        if(position_of_the_player1 > 100){
                position_of_the_player1 = temp1;
        }
        if(position_of_the_player2 > 100){
            position_of_the_player2 = temp2;
        }
        if (position_of_the_player1 < 0) {
            // set the value to 0
            position_of_the_player1 = 0;
        }
        if (position_of_the_player2 < 0) {
            // set the value to 0
            position_of_the_player2 = 0;
        }

        no_of_chances1 += 1;
        no_of_chances2 += 1;
        System.out.println("updated position of the player : " + position_of_the_player1);
        System.out.println("updated position of the player : " + position_of_the_player2);
        System.out.println(position_of_the_player1 + " " + position_of_the_player2 + " " + options1 + " " + options2);
        winner -= 1;
    }
    if(winner == 1 ) System.out.println("player 1 has won!");
    if(winner ==2 ) System.out.println("player 2 has won!");
}
}

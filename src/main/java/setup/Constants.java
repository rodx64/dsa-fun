package setup;

import static setup.dataStructures.ConsoleColors.*;
import static setup.dataStructures.ConsoleColors.RESET;

public abstract class Constants {

    public static final int MAX_SIZE = 100000;
    public static final String MESSAGE_FASTER_COLOR = GREEN_BRIGHT + "Faster %s -> " + BLUE_BRIGHT + "(%s)" + WHITE_BRIGHT + " : %s ns" + RESET;
    public static final String MESSAGE_ADDING_COLOR = YELLOW_BRIGHT + "%s -> " + BLUE_BRIGHT + "(%s)" + WHITE_BRIGHT + " : %s ns" + RESET;
    public static final String MESSAGE_READING_COLOR = CYAN_BRIGHT + "%s -> " + BLUE_BRIGHT + "(%s)" + WHITE_BRIGHT + " : %s ns" + RESET;
    public static final String MESSAGE_REMOVING_COLOR = RED_BRIGHT + "%s -> " + BLUE_BRIGHT + "(%s)" + WHITE_BRIGHT + " : %s ns" + RESET;
    public static final String MESSAGE_CONTAINS_COLOR = WHITE + "%s -> " + BLUE_BRIGHT + "(%s)" + WHITE_BRIGHT + " : %s ns" + RESET;

}

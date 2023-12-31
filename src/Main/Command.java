package Main;
import Characters.*;

/**
 * The enumeration to represent the command the {@link User user} may type.
 */
public enum Command {
    SOUTH, NORTH, WEST, EAST, BACK,
    TAKEITEM, DROPITEM, READITEM, READ, TAKE, DROP, LOOK, Inventory,
    UNKNOWN, HELP, ASK,
}

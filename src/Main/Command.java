package Main;

import Characters.User;

/**
 * The enumeration to represent the command the {@link User user} may type.
 */
public enum Command {
    SOUTH, NORTH, WEST, EAST, BACK,
    TAKEITEM, DROPITEM, READITEM, READ, TAKE, DROP, LOOK, INVENTORY,
    UNKNOWN, HELP, ASK,
}

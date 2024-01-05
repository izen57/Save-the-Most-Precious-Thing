package Characters;

/**
 * The interface to implement the conception of the NPC (besides a {@link Character character}.
 */
public interface NPC {

    /**
     * For NPC in the game, the player can get some information from them while interacting.
     * @return messages that NPC have.
     */
    String getMessage();
}

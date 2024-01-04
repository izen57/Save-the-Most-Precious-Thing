package Characters;


/**
 * The interface to implement the conception of the NPC of an {@link Character character}.
 */
public interface NPC {

    /**
     * For NPC in the game, the player can get information from them during interaction.
     * @return messages that NPC have.
     */
    String getMessage();
}

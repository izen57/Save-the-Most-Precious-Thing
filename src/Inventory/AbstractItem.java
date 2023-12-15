package Inventory;

/**
 * The class for a general item representation. It used by inventory of {@link Locations.Location locations} and {@link Character characters}.
 * An item can be an applicable with implementation of {@link IApplicable} or non-applicable without it.
 */
public abstract class AbstractItem
{
    /**
     * A name of an item.
     */
    private String name;

    /**
     * A description of an item. Mostly it is the message which appears while applying it but can be its story, origin, application, etc.
     */
    private String description;

    public AbstractItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

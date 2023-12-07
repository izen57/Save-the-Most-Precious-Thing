package Inventory;

/**
 * The class for a general item representation. Use it for the general iteration.
 * An item can be an applicable one and non-applicable one.
 */
public abstract class AbstractItem
{
    /**
     * A name of an item
     */
    private String name;

    /**
     * A description of an item. It can include its story, origin, application, etc.
     */
    private String description;

    public AbstractItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

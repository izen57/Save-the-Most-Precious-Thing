package Inventory;

public class Notebook extends AbstractItem implements IApplicable{
    public Notebook() {
        super(
            "notebook",
            "It looks like a diary with a woman's name on the cover and " +
                "today's date on the last page of the diary."
        );
    }

    @Override
    public String getMessage() {
        return "I'm so tired today. I really hope that sometimes " +
            "others can help me instead of me helping others all the time.";
    }
}

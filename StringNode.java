package lab04stringlinkedbagsum19;

/**
 *
 * @author Brian Albert
 */
public class StringNode {

    private String data;
    private StringNode link;

    /**
     * Constructor
     *
     * @param initialData The initial data
     * @param initialLink The initial link
     */
    public StringNode(String initialData, StringNode initialLink) {
        data = initialData;
        link = initialLink;
    }

    /**
     * getData method returns the data
     *
     * @return The data
     */
    public String getData() {
        return data;
    }

    /**
     * getLink method returns the link
     *
     * @return The link
     */
    public StringNode getLink() {
        return link;
    }

    /**
     * The setData method accepts an argument which is stored in the data field
     *
     * @param newData value for data field
     */
    public void setData(String newData) {
        data = newData;
    }

    /**
     * The setLink method accepts an argument which is stored in the link field
     *
     * @param newLink value for link field
     */
    public void setLink(StringNode newLink) {
        link = newLink;
    }
}

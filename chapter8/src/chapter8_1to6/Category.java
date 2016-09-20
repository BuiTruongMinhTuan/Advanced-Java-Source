
package chapter8_1to6;

/**
 *
 * @author Bui Truong Minh Tuan
 * @since 17/09/2016
 * @version 1.0
 */
public class Category {
    private int id;
    private String name;
    private String description;

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
}

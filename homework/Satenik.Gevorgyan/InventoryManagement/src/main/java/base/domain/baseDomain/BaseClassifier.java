package base.domain.baseDomain;

/**
 * Created by Satenik.Gevorgyan on 7/30/2015.
 */
public class BaseClassifier {
    private Integer id;
    private String name;
    private String description;

    //---------------  Getters and Setters ----------------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

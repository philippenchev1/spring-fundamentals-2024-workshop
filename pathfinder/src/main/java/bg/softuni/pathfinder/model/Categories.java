package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.Category;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true)
    @Enumerated(EnumType.STRING)
    private Category name;
    @Column(columnDefinition = "TEXT")
    private String description;

    public Categories() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getName() {
        return name;
    }

    public void setName(Category name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

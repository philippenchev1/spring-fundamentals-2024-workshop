package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.Level;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    @Enumerated(EnumType.STRING)
    private Level level;

    private String name;
    @ManyToOne
    private User author;
    @Column(columnDefinition = "LONGTEXT")
    private String description;

    private String videoUrl;
    @OneToMany(targetEntity = Comments.class,mappedBy = "route")
    private Set<Comments> comments;
    @OneToMany(targetEntity = Pictures.class, mappedBy = "route")
    private Set<Pictures>  pictures;
    @ManyToMany
    private Set<Categories> categories;

    public Set<Categories> getCategories() {
        return categories;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }

    public Route() {
        this.comments = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<Comments> getComments() {
        return comments;
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    public Set<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Pictures> pictures) {
        this.pictures = pictures;
    }
}

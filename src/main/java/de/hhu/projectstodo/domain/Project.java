package de.hhu.projectstodo.domain;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Project {

    @Id
    private Integer id;
    private String title;
    private String typ;
    private String color;
    private String description;
    private int days;
    private double price;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime launchDate;
    private Set<UnternehmenRef> unternehmen = new HashSet<>();

    void addUnternehmen(Unternehmen un){
        unternehmen.add(new UnternehmenRef(un.id()));
    }

    public Project(String title, String typ, String color, String description, int days, double price, LocalDateTime launchDate) {
        this.title = title;
        this.typ = typ;
        this.color = color;
        this.description = description;
        this.days = days;
        this.price = price;
        this.launchDate = launchDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", typ='" + typ + '\'' +
               ", color='" + color + '\'' +
               ", description='" + description + '\'' +
               ", days=" + days +
               ", price=" + price +
               ", launchDate=" + launchDate +
               ", unternehmen=" + unternehmen +
               '}';
    }
}

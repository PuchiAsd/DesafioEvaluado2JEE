package cl.praxis.models;

public class Habitacion {
    private int id;
    private String name;
    private String description;
    private String image;
    private int price;
    private int rooms;
    private int proportions;

    public Habitacion() {

    }

    public Habitacion(int id, String name, String description, String image, int price, int rooms, int proportions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.rooms = rooms;
        this.proportions = proportions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setProportions(int proportions) {
        this.proportions = proportions;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getImage(){
        return image;
    }
    public int getPrice(){
        return price;
    }

    public int getRooms(){
        return rooms;
    }
    public int getProportions(){
        return proportions;
    }
    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", proportions=" + proportions +
                '}';
    }
}


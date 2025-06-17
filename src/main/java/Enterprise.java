
public class Enterprise {
    private String id_enter;
    private String name;
    public Enterprise() {}
    public Enterprise(String id_enter, String name){
        this.id_enter = id_enter;
        this.name = name;
    }

    public void setId_enter(String id_enter) {
        this.id_enter = id_enter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_enter() {
        return id_enter;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id_enter + " " + name;
    }
}

public class Class {
    private String description;

    Class(final String description) {
        this.description = description;
    }

    void setDescrition(){
        System.out.println(this.description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
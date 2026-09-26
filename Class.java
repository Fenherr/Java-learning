public class Class {
    private String description;

    Class(final String description) {
        this.description = description;
    }

    void displayDescrition(){
        System.out.println(this.description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected int height;
    protected int width;
    protected int depth;

    public Class(final int height, final int width, final int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}
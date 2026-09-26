public class Wall extends Class{
    private boolean loadbearing;

    public Wall(final int height, final int width, final int depth, final boolean loadbearing) {
        super(height, width, depth);
        this.loadbearing = loadbearing;
    }

    public void displayWall() {
        System.out.println(
            super.height + " " +
            super.width + " " +
            super.depth + " " +
            this.loadbearing
        );
    }

    @Override 
    void displayDescrition(){
        System.out.println("This is a wall description.");
    }
}

public class Dot {
    private final int x;
    private final int y;
    private final String name; //optional

    public Dot(DotBuilder dotBuilder) {
        x = dotBuilder.x;
        y = dotBuilder.y;
        name = dotBuilder.name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String res = "{" + x + ";" + y;
        if (name != null)
            res += ";" + name;
        res += "}";

        return res;
    }

    public static class DotBuilder {
        private final int x;
        private final int y;
        private String name;

        //constructor for required fields
        public DotBuilder(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //setter for optional field
        public DotBuilder setName(String name) {
            this.name = name;
            return this;
        }

        //Build the Dot object
        public Dot build() {
            return new Dot(this);
        }

    }
}

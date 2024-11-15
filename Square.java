class Square extends Rectangle {
    private double side;

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square: Side: " + side + ", " + super.toString();
    }
}
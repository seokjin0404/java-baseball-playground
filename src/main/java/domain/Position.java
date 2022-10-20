package domain;

public class Position {
    private int position;
    public Position(Position other) {
        position = other.position;
    }
    public Position(int position) {
        this.position = position;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (getClass() != other.getClass())
            return false;
        Position otherPosition = (Position) other;
        return position == otherPosition.position;
    }
}

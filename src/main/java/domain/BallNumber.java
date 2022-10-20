package domain;

public class BallNumber {

    private int ballNumber;

    public BallNumber(BallNumber other) {
        ballNumber = other.ballNumber;
    }
    public BallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }
    public boolean sameNumber(BallNumber ballNumber) {
        return this.ballNumber == ballNumber.ballNumber;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (getClass() != other.getClass())
            return false;
        BallNumber otherNumber = (BallNumber) other;
        return ballNumber == otherNumber.ballNumber;
    }
}

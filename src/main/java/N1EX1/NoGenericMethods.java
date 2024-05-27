package N1EX1;

public class NoGenericMethods {
    private int first;
    private int second;
    private int third;

    public NoGenericMethods(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setThird(int third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

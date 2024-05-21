package N1EX1;

public class NoGenericMethods {
    private Object first;
    private Object second;
    private Object third;

    public NoGenericMethods(Object first, Object second, Object third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public Object getThird() {
        return third;
    }

    public void setThird(Object third) {
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

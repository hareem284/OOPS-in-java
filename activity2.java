//Creating the class counter.
class counter {
    static int count = 20;

    // creating a function to increase the value of the variable count by 1
    void increase() {
        count = count + 1;
    }

    // making public static void main.
    public static void main(String[] args) {
        counter o1 = new counter();
        counter o2 = new counter();
        counter o3 = new counter();
        o1.increase();
        System.out.println("o1 value" + o1.count);
        o2.increase();
        System.out.println("o2 value" + o2.count);
        o3.increase();
        System.out.println("o3 value" + o3.count);
    }
}

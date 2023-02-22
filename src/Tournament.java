public class Tournament {
    private String name;
    private int age;
    private double time;

    public Tournament(String name, int age, double time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getTime() {
        return time;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setTime(int time) {
        this.time = time;
    }
}
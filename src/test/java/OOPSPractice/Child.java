package OOPSPractice;

public class Child extends Parent {
    float bonus = 10000;
    public void display() {
        System.out.println("Child class display method");
    }
    public static void main(String[] args) {
        Parent c = new Child();
        System.out.println("Salary: " + c.salary);
        //System.out.println("Bonus: " + c.bonus);
        c.display();
        System.out.println(c instanceof Child);
    }

    
}

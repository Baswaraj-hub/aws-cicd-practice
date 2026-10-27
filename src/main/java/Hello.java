public class Hello {

    public String getGreeting() {
        return "Automatic CI/CD build triggered!";
    }

    public static void main(String[] args) {
        Hello app = new Hello();
        System.out.println(app.getGreeting());
    }
}
public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Maira", "Turysbekova");

        em1.setAlternateEmail("js@gmail.com");
        em1.showInfo();
        System.out.println("Alternate email: " + em1.getAlternateEmail());

    }
}

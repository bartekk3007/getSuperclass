public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User("Jan", "Kowalski");
        Gamer g1 = new Gamer("Bartek", "Kołakowski");
        System.out.println(User.class.getSuperclass().getName());
        System.out.println(Gamer.class.getSuperclass().getName());
    }
}
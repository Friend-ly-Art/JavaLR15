public class Test extends Sport{
    public Test() {
        super("Тестовый вид спорта", 1, 1);
    }

    @Override
    public String getRules() {
        return "testing";
    }

}

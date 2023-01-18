import ru.netology.sqr.main.SQRService;

public class Main {
    public static void main(String[] args) {
        int x = 200;
        int y = 300;
        SQRService service = new SQRService();
        System.out.println(service.calcSQRt(200, 300));
    }
}

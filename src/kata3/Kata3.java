package kata3;

public class Kata3 {

    public static void main(String[] args) {
        MailReader reader = new MailReader("mails.txt");
        HystogramBuilder<String> builder = new HystogramBuilder<>();
        Hystogram <String> hystogram = builder.build(reader.readDomains());
        new HystogramViewer<String>().print(hystogram);
    }
    
}

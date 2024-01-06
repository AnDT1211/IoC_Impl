import model.IA;

public class App {
    public static void main(String[] args) {
        
        AppIoc context = new AppIoc("testing");
        IA a = context.get(IA.class);
        System.out.println(a);
    }

    
}
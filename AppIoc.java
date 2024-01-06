import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class AppIoc {
    private ResourceBundle resourceBundle;
    public AppIoc(String pathPropFile) {
        resourceBundle = ResourceBundle.getBundle(pathPropFile);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> ct) {
        try {
            String className = resourceBundle.getString("className");
            Class<?> c = Class.forName(className);
            T t = (T)c.getConstructor().newInstance();
            return t;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {



        Class<Cliente> clienteClass = Cliente.class;
        Tabela1 tabela1Annotation = clienteClass.getAnnotation(Tabela1.class);
        if (tabela1Annotation != null) {
            System.out.println("Tabela1 Annotation - Tabela: " + tabela1Annotation.tabela());
        }

        Field[] clienteAtrib = clienteClass.getDeclaredFields();
        for (Field atrib : clienteAtrib) {
            System.out.println("Cliente Field: " + atrib.getName());
        }

        Constructor<?>[] clienteConstrutor = clienteClass.getDeclaredConstructors();
        for (Constructor<?> construtor : clienteConstrutor) {
            System.out.println("Cliente Constructor: " + construtor);
        }

        Method[] clienteMethods = clienteClass.getDeclaredMethods();
        for (Method method : clienteMethods) {
            System.out.println("Cliente Method: " + method.getName());
        }

        Class<Produto> produtoClass = Produto.class;
        Tabela2 tabela2Annotation = produtoClass.getAnnotation(Tabela2.class);
        if (tabela2Annotation != null) {
            System.out.println("Tabela2 Annotation - Tabela: " + tabela2Annotation.tabela());
        }

        Field[] produtoFields = produtoClass.getDeclaredFields();
        for (Field field : produtoFields) {
            System.out.println("Produto Field: " + field.getName());
        }

        Constructor<?>[] produtoConstructors = produtoClass.getDeclaredConstructors();
        for (Constructor<?> constructor : produtoConstructors) {
            System.out.println("Produto Constructor: " + constructor);
        }

        Method[] produtoMethods = produtoClass.getDeclaredMethods();
        for (Method method : produtoMethods) {
            System.out.println("Produto Method: " + method.getName());
        }

        /*Constructor<?>[] clienteConstructors = clienteClass.getDeclaredConstructors();
        for (Constructor<?> constructor : clienteConstructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            StringBuilder parameterTypeNames = new StringBuilder();
            for (Class<?> parameterType : parameterTypes) {
                parameterTypeNames.append(parameterType.getSimpleName()).append(",");
            }
            if (parameterTypeNames.length() > 0) {
                parameterTypeNames.deleteCharAt(parameterTypeNames.length() - 1);
            }
            System.out.println("Cliente Constructor: " + constructor.getName() + "(" + parameterTypeNames + ")");
        }*/
    }
}
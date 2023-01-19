package kata6;

import com.google.gson.Gson;
import java.lang.reflect.Field;

public class FieldClass {
    
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Class c = PokemonStat.class;
        PokemonStat stats = new PokemonStat();
        Field[] fields = c.getDeclaredFields();
        int i = 10;
        for (Field field : fields) {
            field.setAccessible(true);
            if(field.getType() == String.class) field.set(stats, String.valueOf(i));
            i+=10;
        }
        System.out.println(new Gson().toJson(stats));
    }
}

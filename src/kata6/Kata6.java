package kata6;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import static java.util.stream.Collectors.joining;

public class Kata6 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/luxray");
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(read(url), JsonObject.class)
                .get("stats").getAsJsonArray()
                .get(1).getAsJsonObject();
        
        PokemonStat attack = gson.fromJson(jsonObject, PokemonStat.class);
        System.out.println(attack.toString());
    }
    
    
    private static String read(URL url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            return reader.lines().collect(joining());
        }           
    }
    
}

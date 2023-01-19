package kata6;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PokemonStat {
    public String base_stat;
    public String effort;
    public Stat stat;

    @Override
    public String toString() {
        return "PokemonStat{" + "stat=" + stat + ", base_stat=" + base_stat + ", effort=" + effort + '}';
    }
    
    
    public static class Stat{
        public String name;
        public String url;

        @Override
        public String toString() {
            return "Stat{" + "name=" + name + '}';
        }
        
    }
}

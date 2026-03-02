package pro1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Tools1
{
    public static String analyze(Path path)
    {
        List<String> lines;
        HashMap<String,Integer> map = new HashMap();
        try {
            lines = Files.readAllLines(path);
            for(var line :lines){
                var current = map.getOrDefault(line,0);
                map.put(line, current+1);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return map.keySet()
                .stream()
                .sorted(Comparator.comparing(o -> o))
                .map((x)->x+":"+map.get(x))
                .collect(Collectors.joining(","));
    }
}

package lesson13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {
        String str = "I like read books. It is very important. News are a good.";
        String[] split = str.split("\\W+");
        System.out.println();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
//            Integer oldValue = map.get(s.length()); // 1 0 null?
//            Integer value = oldValue == null ? 1 : oldValue + 1;

            Integer oldValue = map.getOrDefault(s.length(), 0);
            Integer value = oldValue + 1;
            map.put(s.length(), value);
        }

        Integer put = map.put(9, 10);
        System.out.println(put);
//        map.put(null, 1);
//        System.out.println(map.getOrDefault(null, 2));
        System.out.println(map);

        System.out.println(map.size());

        Set<Integer> keySet = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(keySet.size() == values.size());
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
//            entry.setValue(4);
        }

        HashMap<Integer, Integer> newMap = new HashMap<>(map);

        Map<Integer, Integer> integerIntegerMap = Collections.unmodifiableMap(map);
        integerIntegerMap.put(1, 1);
    }
}

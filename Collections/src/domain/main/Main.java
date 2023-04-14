package domain.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List miList = new ArrayList();
        miList.add("Lunes");
        miList.add("Martes");
        miList.add("Miercoles");
        miList.add("Jueves");
        miList.add("Viernes");        
        miList.forEach(elm -> System.out.println("elm = " + elm));
        
        Set set = new HashSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.forEach(System.out::println);

        Map miMap = new HashMap();
        miMap.put(1, "Johan");
        miMap.put(2, "Ana");
        miMap.put(3, "Laura");        
        String elm = (String) miMap.get(1);
        miMap.keySet().forEach(System.out::println);
        miMap.values().forEach(System.out::println);
    }
}

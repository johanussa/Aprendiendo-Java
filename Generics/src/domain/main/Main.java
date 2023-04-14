package domain.main;

import domain.generics.ClassGeneric;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClassGeneric<String> generic = new ClassGeneric<String>("Hola Johan");
        System.out.println("generic = " + generic.getObject());
        generic.setObject("Hola de nuevo johan");
        System.out.println("generic = " + generic.getObject());
        generic.getClassGeneric();
        
        ClassGeneric<Integer> genericInt = new ClassGeneric<>(1994);
        System.out.println("\ngeneric = " + genericInt.getObject());
        genericInt.setObject(2023);
        System.out.println("generic = " + genericInt.getObject());
        genericInt.getClassGeneric();
        
        List<String> listNames = new ArrayList<>();
        listNames.add("Johan");
        listNames.add("Laura");
        listNames.add("Maria");
        String name = listNames.get(0);
        System.out.println("\nname = " + name);
        showData(listNames);
        
        Set<String> setNames = new HashSet<>();
        setNames.add("Java");
        setNames.add("C++");
        setNames.add("C#");
        showData(setNames);
        
        Map<Integer, String> miMap = new HashMap<>();
        miMap.put(1, "JavaScript");
        miMap.put(2, "Ruby");
        miMap.put(3, "Phyton");
        String elmMap = miMap.get(2);
        System.out.println("Elm-Map: " + elmMap);
        showData(miMap.keySet());
        showData(miMap.values());
    }
    public static void showData(Collection collection) {
        collection.forEach(elm -> System.out.println("Element: " + elm));
    }
}

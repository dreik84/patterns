package org.example.depencencies.bad.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ServiceLocator {
    List<Integer> dependency1;
    Map<String, String> dependency2;
    int some;

    public ServiceLocator() {
        dependency1 = Context.DEPENDENCY1;
        dependency2 = Context.DEPENDENCY2;
        some = 5;
    }
}

class Context {
    static List<Integer> DEPENDENCY1 = new ArrayList<>();
    static Map<String, String> DEPENDENCY2 = new HashMap<>();
}

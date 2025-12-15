package org.example.depencencies.bad.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ConstructorDependencies {
    List<Integer> dependency1;
    Map<String, String> dependency2;
    int some;

    public ConstructorDependencies() {
        dependency1 = new ArrayList<>();
        dependency2 = new HashMap<>();
        some = 5;
    }
}

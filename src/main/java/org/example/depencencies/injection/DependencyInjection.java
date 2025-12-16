package org.example.depencencies.injection;

import java.util.List;
import java.util.Map;

class DependencyInjection {
    List<Integer> dependency1;
    Map<String, String> dependency2;
    int some;

    public DependencyInjection(List<Integer> dependency1, Map<String, String> dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
        some = 5;
    }
}

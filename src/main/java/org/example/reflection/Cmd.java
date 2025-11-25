package org.example.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // Видимость аннотации
@Target(ElementType.METHOD)          // Типы аннотируемых элементов
@interface Cmd {

    String name();

    String description();
}

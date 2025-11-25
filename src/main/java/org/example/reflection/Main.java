package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void getClassInfo(Object object) {

        Class<?> aClass = object.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();
        Constructor<?>[] constructors = aClass.getConstructors();

        System.out.println(aClass);
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(declaredFields));
        System.out.println(Arrays.toString(constructors));
    }

    public static void setPrivateValue(Object object, String fieldName, String newValue) {
        Class<?> aClass = object.getClass();

        try {
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, newValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Test createTestObjectWithValue(String value) {
        try {
            Constructor<Test> constructor = Test.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void callPrivateMethod(Object object, String methodName, String parameter) {
        Class<?> aClass = object.getClass();

        try {
            Method method = aClass.getDeclaredMethod(methodName, String.class);
            method.setAccessible(true);
            method.invoke(object, parameter);
        } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var test = createTestObjectWithValue("initValue");
        System.out.println(test);
        getClassInfo(test);
        setPrivateValue(test, "value", "newValue");
        System.out.println(test);
        callPrivateMethod(test, "setValue", "privateValue");
        System.out.println(test);
        Commands commands = new Commands();
        commands.printHelp();
    }
}

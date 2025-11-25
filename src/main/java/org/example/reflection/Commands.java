package org.example.reflection;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class Commands {

    Map<String, String> availableCommands;

    Commands() {
        this.availableCommands = new HashMap<>();
        Method[] methods = this.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Cmd.class)) {
                Cmd cmdInfo = method.getAnnotation(Cmd.class);
                availableCommands.put(cmdInfo.name(), cmdInfo.description());
            }
        }
    }

    @Cmd(name = "Exit", description = "Exit Application")
    public void exit() {
        System.out.println("exit");
    }

    @Cmd(name =  "Help", description = "Show all available commands")
    public void printHelp() {
        StringBuilder sb = new StringBuilder();
        availableCommands.forEach((key, value) -> sb.append(key).append(": ").append(value).append("\n"));
        System.out.println(sb);
    }
}

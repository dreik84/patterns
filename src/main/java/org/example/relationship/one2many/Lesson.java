package org.example.relationship.one2many;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Lesson {
    private String name;
    private Course course;

    public Lesson(String name, Course course) {
        this.name = name;
        this.course = course;
    }
}

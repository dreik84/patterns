package org.example.relationship.many2many;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
class Course {
    private String name;
    private List<CourseMember> courseMembers;

    public Course(String name) {
        this.name = name;
        courseMembers = new ArrayList<>();
    }

    public void addCourseMember(CourseMember courseMember) {
        courseMembers.add(courseMember);
    }

    public void removeCourseMember(CourseMember courseMember) {
        courseMembers.remove(courseMember);
    }
}

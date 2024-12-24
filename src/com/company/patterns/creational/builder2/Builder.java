package com.company.patterns.creational.builder2;

import java.util.List;

public interface Builder {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setAge(int age);
    void setHardSkills(List<String> hardSkills);
    void setSoftSkills(List<String> softSkills);
    Programmer createProgrammer();
}

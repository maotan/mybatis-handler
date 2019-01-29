package com.tan.mao.domain.enums;

public enum TeacherType {
    COMMON(0),
    HIGH(1),
    SPECIAL(2);

    private Integer value;

    TeacherType(Integer value){
        this.value = value;
    }

    public static TeacherType get(Integer value) {
        for (TeacherType z : values()) {
            if (z.value.equals(value)) {
                return z;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return this.value.toString();
    }

}

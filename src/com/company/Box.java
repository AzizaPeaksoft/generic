package com.company;

public class Box<T>{
    private int var;
    private int var2;

    public Box(int var, int var2) {
        this.var = var;
        this.var2 = var2;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Box: " +
                "var = " + var +
                ", var2 = " + var2 +
                ' ';
    }
    public static <T> void genericMethod(T var, T var2) {
        System.out.println(var);
        System.out.println(var2);
    }
}


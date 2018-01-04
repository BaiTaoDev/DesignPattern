package com.jamie.prototype;

/**
 * @author JamieBai
 * @create 2018/01/04
 */
public class Prototype implements Cloneable {

    private int x;
    private int y;
    private int z;

    public Prototype() {
        this.x = 2;
        this.y = 3;
        this.z = 4;
    }

    public void change() {
        this.x = 9;
        this.y = 8;
        this.z = 7;
    }

    @Override
    public Prototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (Prototype) object;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }

    public static void main(String[] args) {
        Prototype prototype1 = new Prototype();
        prototype1.change();
        System.out.println(prototype1);
        Prototype prototype2 = prototype1.clone();
        System.out.println(prototype2);
    }

}
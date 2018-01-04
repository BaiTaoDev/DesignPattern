package com.jamie.prototype;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class ShallowClone implements Cloneable {
    private Field field;

    @Override
    public ShallowClone clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (ShallowClone) object;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}

class Field {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

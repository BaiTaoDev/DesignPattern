package com.jamie.prototype;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class DeepClone implements Cloneable {
    private DeepField deepField;

    @Override
    public DeepClone clone() {
        Object object = null;
        try {
            object = super.clone();
            ((DeepClone)object).setDeepField(this.deepField.clone());
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (DeepClone) object;
    }

    public DeepField getDeepField() {
        return deepField;
    }

    public void setDeepField(DeepField deepField) {
        this.deepField = deepField;
    }
}

class DeepField implements Cloneable {
    private int a = 1;
    private int b = 2;

    @Override
    protected DeepField clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception);
        }
        return (DeepField) object;
    }

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

package com.jamie.prototype;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class ShallowCloneTest {
    public static void main(String[] args) {
        Field field = new Field();
        field.setA(100);
        field.setB(200);

        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setField(field);
        System.out.println(shallowClone.getField());

        ShallowClone shallowCloneNew = shallowClone.clone();
        System.out.println(shallowCloneNew.getField());
        /**
         * com.jamie.prototype.Field@6d6f6e28
         * com.jamie.prototype.Field@6d6f6e28
         */
    }
}

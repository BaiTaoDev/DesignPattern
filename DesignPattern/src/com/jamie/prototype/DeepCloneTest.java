package com.jamie.prototype;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        DeepField deepField = new DeepField();
        deepField.setA(100);
        deepField.setB(200);
        DeepClone deepClone = new DeepClone();
        deepClone.setDeepField(deepField);

        DeepClone deepCloneNew = deepClone.clone();

        System.out.println(deepClone.getDeepField());
        System.out.println(deepClone.getDeepField().getA());
        System.out.println(deepClone.getDeepField().getB());
        System.out.println(deepCloneNew.getDeepField());
        System.out.println(deepCloneNew.getDeepField().getA());
        System.out.println(deepCloneNew.getDeepField().getB());
    }
}

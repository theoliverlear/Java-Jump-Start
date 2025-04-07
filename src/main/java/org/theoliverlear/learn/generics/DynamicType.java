package org.theoliverlear.learn.generics;

public class DynamicType<T> {
    //============================-Variables-=================================
    private T genericField;
    //===========================-Constructors-===============================
    public DynamicType(T genericField) {
        this.genericField = genericField;
        this.printType();
    }
    //--------------------------------Add-------------------------------------
    public void add(T value) {
        switch (value) {
            case Integer integer -> {
                int fieldsAdded = (Integer) this.genericField + integer;
                System.out.println("Integer: " + fieldsAdded);
            }
            case String string -> {
                String fieldsAdded = this.genericField + string;
                System.out.println("String: " + fieldsAdded);
            }
            case Double doubleNum -> {
                double fieldsAdded = (Double) this.genericField + doubleNum;
                System.out.println("Double: " + fieldsAdded);
            }
            case Boolean bool -> {
                boolean fieldsAdded = (Boolean) this.genericField || bool;
                System.out.println("Boolean: " + fieldsAdded);
            }
            default -> System.out.println("Unknown type");
        }
    }
    //-----------------------------Print-Type---------------------------------
    public void printType() {
        System.out.println("Type of T: " + this.genericField.getClass().getName());
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        DynamicType<String> stringInstance = new DynamicType<>("Hello");
        stringInstance.add(" World");
        DynamicType<Integer> integerInstance = new DynamicType<>(123);
        integerInstance.add(456);
        DynamicType<Double> doubleInstance = new DynamicType<>(123.45);
        doubleInstance.add(678.90);
        DynamicType<Boolean> booleanInstance = new DynamicType<>(true);
        booleanInstance.add(false);
    }
}

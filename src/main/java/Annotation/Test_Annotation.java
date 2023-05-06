package Annotation;

import java.lang.reflect.Field;

@Good
public class Test_Annotation {
int age;
String name;
Double ee;



    @Good(value=1000,age=50)
    void m1(){

    }

    public static void main(String[] args) throws Exception{
Class aClass = Class.forName("Annotation.Test_Annotation");
        System.out.println(aClass.getName());
        System.out.println(aClass.getPackageName());
        System.out.println(aClass.getSuperclass());
        System.out.println(aClass.getSimpleName());

        Field[] f= aClass.getDeclaredFields();

        for (Field fields: f
             ) {
            System.out.println(fields.getType());
            System.out.println(fields.getName());

        }



    }
}

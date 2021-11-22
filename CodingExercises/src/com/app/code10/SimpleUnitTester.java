package com.app.code10;

import java.lang.reflect.Method;

public class SimpleUnitTester {

    public int execute(Class clazz) throws Exception {
        int failedCount = 0;
        Object newinstance = clazz.newInstance();  //creating class object from given object

        Method[] methods = clazz.getDeclaredMethods();
        for(Method m: methods)
        {
            String methodName = m.getName();
            if(methodName.startsWith("test") && m.getReturnType() == boolean.class)
            {
                System.out.println(m.getName());
                Object result = m.invoke(newinstance);
                if (!(boolean) result) {
                	System.out.println(result);
                    failedCount += 1;
                }
            }
        }
        return failedCount;
    }

    public static void main(String[] args) throws Exception {
        SimpleUnitTester unitTester = new SimpleUnitTester();
        
            System.out.println(unitTester.execute(Reflection.class));
    }
}
 
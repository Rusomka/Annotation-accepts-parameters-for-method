package sample;

import java.lang.reflect.Method;

public class ReflectionTestMain {
    public static void main(String[] args) {
        Test t = new Test();
        Class<?> cls = t.getClass();
        Method[] met = cls.getDeclaredMethods();
        
        try {
            for (Method m : met) {
                if (m.isAnnotationPresent(MethodParameters.class)) {
                    MethodParameters mp = m.getAnnotation(MethodParameters.class);
                    Method mt = cls.getMethod(m.getName(), int.class, int.class);
                    int res = (Integer) mt.invoke(t, mp.inA(), mp.inB());
                    System.out.println(res);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

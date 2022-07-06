package sample;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodParameters {
    int inA() default 0;
    int inB() default 0;

}

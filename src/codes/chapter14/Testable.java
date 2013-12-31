package codes.chapter14;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//使用JDK的元素数据Annotation:Retention
@Retention(RetentionPolicy.RUNTIME)
//使用JDK的雨水尿素数据Annotation:Target
@Target(ElementType.METHOD)

@Documented
public @interface Testable {

}

package codes.chapter14;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ʹ��JDK��Ԫ������Annotation:Retention
@Retention(RetentionPolicy.RUNTIME)
//ʹ��JDK����ˮ��������Annotation:Target
@Target(ElementType.METHOD)

@Documented
public @interface Testable {

}

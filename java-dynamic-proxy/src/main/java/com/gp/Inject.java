
package com.gp;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({FIELD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
    
}

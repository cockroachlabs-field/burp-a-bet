package io.burpabet.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Service;

/**
 * Indicates the annotated class is a fine-grained service behind a transaction boundary.
 * Its architectural role is to perform actual business logic processing in the
 * context of an existing transaction.
 * <p/>
 * Marks the annotated class as {@link org.springframework.transaction.annotation.Transactional @Transactional}
 * with propagation level {@link org.springframework.transaction.annotation.Propagation#MANDATORY MANDATORY},
 * clearly indicating that a transaction must be started before method entry.
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Service
@TransactionMandatory
public @interface ControlService {
}

package org.livingdoc.api.fixtures.decisiontables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Methods annotated with this annotation are invoked after the last row of the decision table example was evaluated.
 * These methods are intended to close resources initialized in {@link BeforeTable} annotated methods.
 * <p>
 * <b>Constraints:</b>
 * <ol>
 * <li>The annotated method must not have any parameters!</li>
 * <li>If multiple methods of a single fixture are annotated the invocation order is non-deterministic!</li>
 * </ol>
 *
 * @see DecisionTableFixture
 * @since 2.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AfterTable {
}

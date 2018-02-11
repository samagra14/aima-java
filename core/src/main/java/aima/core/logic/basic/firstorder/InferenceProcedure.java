package aima.core.logic.basic.firstorder;

import aima.core.logic.basic.firstorder.parsing.ast.Sentence;

public interface InferenceProcedure {
    /**
     *
     * @param kb
     *            the knowledge base against which the query is to be made.
     * @param query
     *            the query to be answered.
     * @return an InferenceResult.
     */
    InferenceResult ask(FOLKnowledgeBase kb, Sentence query);
}

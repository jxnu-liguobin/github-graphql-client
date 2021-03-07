package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field relatedTopics in type Topic
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TopicRelatedTopicsParametrizedInput implements GraphQLParametrizedInput {

    private Integer first = 3;

    public TopicRelatedTopicsParametrizedInput() {
    }

    public TopicRelatedTopicsParametrizedInput(Integer first) {
        this.first = first;
    }

    public TopicRelatedTopicsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TopicRelatedTopicsParametrizedInput that = (TopicRelatedTopicsParametrizedInput) obj;
        return Objects.equals(first, that.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        return joiner.toString();
    }

}

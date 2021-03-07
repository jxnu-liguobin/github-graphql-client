package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field relatedTopics in type Topic
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        return joiner.toString();
    }

}

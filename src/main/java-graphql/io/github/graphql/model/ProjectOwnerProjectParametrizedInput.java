package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field project in type ProjectOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectOwnerProjectParametrizedInput implements GraphQLParametrizedInput {

    private int number;

    public ProjectOwnerProjectParametrizedInput() {
    }

    public ProjectOwnerProjectParametrizedInput(int number) {
        this.number = number;
    }

    public ProjectOwnerProjectParametrizedInput number(int number) {
        this.number = number;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        return joiner.toString();
    }

}

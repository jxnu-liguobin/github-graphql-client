package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field repository in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationRepositoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String name;

    public OrganizationRepositoryParametrizedInput() {
    }

    public OrganizationRepositoryParametrizedInput(String name) {
        this.name = name;
    }

    public OrganizationRepositoryParametrizedInput name(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

}

package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field ref in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryRefParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String qualifiedName;

    public RepositoryRefParametrizedInput() {
    }

    public RepositoryRefParametrizedInput(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public RepositoryRefParametrizedInput qualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (qualifiedName != null) {
            joiner.add("qualifiedName: " + GraphQLRequestSerializer.getEntry(qualifiedName));
        }
        return joiner.toString();
    }

}

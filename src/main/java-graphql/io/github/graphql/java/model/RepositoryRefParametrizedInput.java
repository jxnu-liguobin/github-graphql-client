package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field ref in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryRefParametrizedInput that = (RepositoryRefParametrizedInput) obj;
        return Objects.equals(qualifiedName, that.qualifiedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifiedName);
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

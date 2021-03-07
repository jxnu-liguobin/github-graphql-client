package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field fileByName in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionFileByNameParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String filename;

    public RegistryPackageVersionFileByNameParametrizedInput() {
    }

    public RegistryPackageVersionFileByNameParametrizedInput(String filename) {
        this.filename = filename;
    }

    public RegistryPackageVersionFileByNameParametrizedInput filename(String filename) {
        this.filename = filename;
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
        final RegistryPackageVersionFileByNameParametrizedInput that = (RegistryPackageVersionFileByNameParametrizedInput) obj;
        return Objects.equals(filename, that.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (filename != null) {
            joiner.add("filename: " + GraphQLRequestSerializer.getEntry(filename));
        }
        return joiner.toString();
    }

}

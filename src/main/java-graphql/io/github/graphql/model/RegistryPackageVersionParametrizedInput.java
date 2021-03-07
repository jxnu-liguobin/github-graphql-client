package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field version in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageVersionParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String version;

    public RegistryPackageVersionParametrizedInput() {
    }

    public RegistryPackageVersionParametrizedInput(String version) {
        this.version = version;
    }

    public RegistryPackageVersionParametrizedInput version(String version) {
        this.version = version;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        return joiner.toString();
    }

}

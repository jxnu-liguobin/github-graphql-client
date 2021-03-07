package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field packageFileBySha256 in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackagePackageFileBySha256ParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String sha256;

    public RegistryPackagePackageFileBySha256ParametrizedInput() {
    }

    public RegistryPackagePackageFileBySha256ParametrizedInput(String sha256) {
        this.sha256 = sha256;
    }

    public RegistryPackagePackageFileBySha256ParametrizedInput sha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256));
        }
        return joiner.toString();
    }

}

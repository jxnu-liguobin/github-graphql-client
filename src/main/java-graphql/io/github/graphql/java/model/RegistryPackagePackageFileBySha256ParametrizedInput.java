package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field packageFileBySha256 in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RegistryPackagePackageFileBySha256ParametrizedInput that = (RegistryPackagePackageFileBySha256ParametrizedInput) obj;
        return Objects.equals(sha256, that.sha256);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha256);
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

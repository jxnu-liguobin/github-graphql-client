package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field packageFileByGuid in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackagePackageFileByGuidParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String guid;

    public RegistryPackagePackageFileByGuidParametrizedInput() {
    }

    public RegistryPackagePackageFileByGuidParametrizedInput(String guid) {
        this.guid = guid;
    }

    public RegistryPackagePackageFileByGuidParametrizedInput guid(String guid) {
        this.guid = guid;
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
        final RegistryPackagePackageFileByGuidParametrizedInput that = (RegistryPackagePackageFileByGuidParametrizedInput) obj;
        return Objects.equals(guid, that.guid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid));
        }
        return joiner.toString();
    }

}

package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field packageFileByGuid in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid));
        }
        return joiner.toString();
    }

}

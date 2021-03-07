package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field fileByName in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (filename != null) {
            joiner.add("filename: " + GraphQLRequestSerializer.getEntry(filename));
        }
        return joiner.toString();
    }

}

package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dependencies in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageVersionDependenciesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private RegistryPackageDependencyTypeTO type;

    public RegistryPackageVersionDependenciesParametrizedInput() {
    }

    public RegistryPackageVersionDependenciesParametrizedInput(String after, String before, Integer first, Integer last, RegistryPackageDependencyTypeTO type) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.type = type;
    }

    public RegistryPackageVersionDependenciesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RegistryPackageVersionDependenciesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RegistryPackageVersionDependenciesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RegistryPackageVersionDependenciesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RegistryPackageVersionDependenciesParametrizedInput type(RegistryPackageDependencyTypeTO type) {
        this.type = type;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

}

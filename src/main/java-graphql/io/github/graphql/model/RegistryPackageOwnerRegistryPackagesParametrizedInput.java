package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field registryPackages in type RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageOwnerRegistryPackagesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String name;
    private java.util.List<String> names;
    private RegistryPackageTypeTO packageType;
    private Boolean publicOnly = false;
    private String registryPackageType;
    private String repositoryId;

    public RegistryPackageOwnerRegistryPackagesParametrizedInput() {
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput(String after, String before, Integer first, Integer last, String name, java.util.List<String> names, RegistryPackageTypeTO packageType, Boolean publicOnly, String registryPackageType, String repositoryId) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.name = name;
        this.names = names;
        this.packageType = packageType;
        this.publicOnly = publicOnly;
        this.registryPackageType = registryPackageType;
        this.repositoryId = repositoryId;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput name(String name) {
        this.name = name;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput names(java.util.List<String> names) {
        this.names = names;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput packageType(RegistryPackageTypeTO packageType) {
        this.packageType = packageType;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput publicOnly(Boolean publicOnly) {
        this.publicOnly = publicOnly;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput registryPackageType(String registryPackageType) {
        this.registryPackageType = registryPackageType;
        return this;
    }

    public RegistryPackageOwnerRegistryPackagesParametrizedInput repositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (names != null) {
            joiner.add("names: " + GraphQLRequestSerializer.getEntry(names));
        }
        if (packageType != null) {
            joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType));
        }
        if (publicOnly != null) {
            joiner.add("publicOnly: " + GraphQLRequestSerializer.getEntry(publicOnly));
        }
        if (registryPackageType != null) {
            joiner.add("registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        return joiner.toString();
    }

}

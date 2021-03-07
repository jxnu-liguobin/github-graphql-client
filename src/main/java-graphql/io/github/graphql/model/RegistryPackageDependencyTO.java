package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageDependencyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private RegistryPackageDependencyTypeTO dependencyType;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String version;

    public RegistryPackageDependencyTO() {
    }

    public RegistryPackageDependencyTO(RegistryPackageDependencyTypeTO dependencyType, String id, String name, String version) {
        this.dependencyType = dependencyType;
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public RegistryPackageDependencyTypeTO getDependencyType() {
        return dependencyType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dependencyType != null) {
            joiner.add("dependencyType: " + GraphQLRequestSerializer.getEntry(dependencyType));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        return joiner.toString();
    }

    public static RegistryPackageDependencyTO.Builder builder() {
        return new RegistryPackageDependencyTO.Builder();
    }

    public static class Builder {

        private RegistryPackageDependencyTypeTO dependencyType;
        private String id;
        private String name;
        private String version;

        public Builder() {
        }

        public Builder setDependencyType(RegistryPackageDependencyTypeTO dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public RegistryPackageDependencyTO build() {
            return new RegistryPackageDependencyTO(dependencyType, id, name, version);
        }

    }
}

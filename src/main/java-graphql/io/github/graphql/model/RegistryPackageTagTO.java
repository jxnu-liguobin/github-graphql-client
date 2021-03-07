package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageTagTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private RegistryPackageVersionTO version;

    public RegistryPackageTagTO() {
    }

    public RegistryPackageTagTO(String id, String name, RegistryPackageVersionTO version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public RegistryPackageVersionTO getVersion() {
        return version;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

    public static RegistryPackageTagTO.Builder builder() {
        return new RegistryPackageTagTO.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private RegistryPackageVersionTO version;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(RegistryPackageVersionTO version) {
            this.version = version;
            return this;
        }


        public RegistryPackageTagTO build() {
            return new RegistryPackageTagTO(id, name, version);
        }

    }
}

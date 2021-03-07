package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryPackageTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private SecurityAdvisoryEcosystemTO ecosystem;
    @javax.validation.constraints.NotNull
    private String name;

    public SecurityAdvisoryPackageTO() {
    }

    public SecurityAdvisoryPackageTO(SecurityAdvisoryEcosystemTO ecosystem, String name) {
        this.ecosystem = ecosystem;
        this.name = name;
    }

    public SecurityAdvisoryEcosystemTO getEcosystem() {
        return ecosystem;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ecosystem != null) {
            joiner.add("ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static SecurityAdvisoryPackageTO.Builder builder() {
        return new SecurityAdvisoryPackageTO.Builder();
    }

    public static class Builder {

        private SecurityAdvisoryEcosystemTO ecosystem;
        private String name;

        public Builder() {
        }

        public Builder setEcosystem(SecurityAdvisoryEcosystemTO ecosystem) {
            this.ecosystem = ecosystem;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public SecurityAdvisoryPackageTO build() {
            return new SecurityAdvisoryPackageTO(ecosystem, name);
        }

    }
}

package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field versionByPlatform in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionByPlatformParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String platform;
    @javax.validation.constraints.NotNull
    private String version;

    public RegistryPackageVersionByPlatformParametrizedInput() {
    }

    public RegistryPackageVersionByPlatformParametrizedInput(String platform, String version) {
        this.platform = platform;
        this.version = version;
    }

    public RegistryPackageVersionByPlatformParametrizedInput platform(String platform) {
        this.platform = platform;
        return this;
    }

    public RegistryPackageVersionByPlatformParametrizedInput version(String version) {
        this.version = version;
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
        final RegistryPackageVersionByPlatformParametrizedInput that = (RegistryPackageVersionByPlatformParametrizedInput) obj;
        return Objects.equals(platform, that.platform)
            && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, version);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (platform != null) {
            joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        return joiner.toString();
    }

}

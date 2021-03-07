package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String color;
    @javax.validation.constraints.NotNull
    private String id;
    private RegistryPackageVersionTO latestVersion;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String nameWithOwner;
    @javax.validation.constraints.NotNull
    private RegistryPackageTypeTO packageType;
    private String registryPackageType;
    private RepositoryTO repository;
    private RegistryPackageStatisticsTO statistics;

    public RegistryPackageTO() {
    }

    public RegistryPackageTO(String color, String id, RegistryPackageVersionTO latestVersion, String name, String nameWithOwner, RegistryPackageTypeTO packageType, String registryPackageType, RepositoryTO repository, RegistryPackageStatisticsTO statistics) {
        this.color = color;
        this.id = id;
        this.latestVersion = latestVersion;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.packageType = packageType;
        this.registryPackageType = registryPackageType;
        this.repository = repository;
        this.statistics = statistics;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public RegistryPackageVersionTO getLatestVersion() {
        return latestVersion;
    }

    public String getName() {
        return name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }

    public RegistryPackageTypeTO getPackageType() {
        return packageType;
    }

    public String getRegistryPackageType() {
        return registryPackageType;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public RegistryPackageStatisticsTO getStatistics() {
        return statistics;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (color != null) {
            joiner.add("color: " + GraphQLRequestSerializer.getEntry(color));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (latestVersion != null) {
            joiner.add("latestVersion: " + GraphQLRequestSerializer.getEntry(latestVersion));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (nameWithOwner != null) {
            joiner.add("nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner));
        }
        if (packageType != null) {
            joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType));
        }
        if (registryPackageType != null) {
            joiner.add("registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics));
        }
        return joiner.toString();
    }

    public static RegistryPackageTO.Builder builder() {
        return new RegistryPackageTO.Builder();
    }

    public static class Builder {

        private String color;
        private String id;
        private RegistryPackageVersionTO latestVersion;
        private String name;
        private String nameWithOwner;
        private RegistryPackageTypeTO packageType;
        private String registryPackageType;
        private RepositoryTO repository;
        private RegistryPackageStatisticsTO statistics;

        public Builder() {
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLatestVersion(RegistryPackageVersionTO latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNameWithOwner(String nameWithOwner) {
            this.nameWithOwner = nameWithOwner;
            return this;
        }

        public Builder setPackageType(RegistryPackageTypeTO packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setRegistryPackageType(String registryPackageType) {
            this.registryPackageType = registryPackageType;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setStatistics(RegistryPackageStatisticsTO statistics) {
            this.statistics = statistics;
            return this;
        }


        public RegistryPackageTO build() {
            return new RegistryPackageTO(color, id, latestVersion, name, nameWithOwner, packageType, registryPackageType, repository, statistics);
        }

    }
}

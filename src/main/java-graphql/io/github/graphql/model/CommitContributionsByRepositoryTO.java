package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitContributionsByRepositoryTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public CommitContributionsByRepositoryTO() {
    }

    public CommitContributionsByRepositoryTO(RepositoryTO repository, String resourcePath, String url) {
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static CommitContributionsByRepositoryTO.Builder builder() {
        return new CommitContributionsByRepositoryTO.Builder();
    }

    public static class Builder {

        private RepositoryTO repository;
        private String resourcePath;
        private String url;

        public Builder() {
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public CommitContributionsByRepositoryTO build() {
            return new CommitContributionsByRepositoryTO(repository, resourcePath, url);
        }

    }
}

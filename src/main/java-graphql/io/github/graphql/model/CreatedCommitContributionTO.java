package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedCommitContributionTO implements java.io.Serializable, ContributionTO {

    private int commitCount;
    private boolean isRestricted;
    @javax.validation.constraints.NotNull
    private String occurredAt;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private UserTO user;

    public CreatedCommitContributionTO() {
    }

    public CreatedCommitContributionTO(int commitCount, boolean isRestricted, String occurredAt, RepositoryTO repository, String resourcePath, String url, UserTO user) {
        this.commitCount = commitCount;
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public int getCommitCount() {
        return commitCount;
    }

    public boolean getIsRestricted() {
        return isRestricted;
    }

    public String getOccurredAt() {
        return occurredAt;
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

    public UserTO getUser() {
        return user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("commitCount: " + GraphQLRequestSerializer.getEntry(commitCount));
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted));
        if (occurredAt != null) {
            joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static CreatedCommitContributionTO.Builder builder() {
        return new CreatedCommitContributionTO.Builder();
    }

    public static class Builder {

        private int commitCount;
        private boolean isRestricted;
        private String occurredAt;
        private RepositoryTO repository;
        private String resourcePath;
        private String url;
        private UserTO user;

        public Builder() {
        }

        public Builder setCommitCount(int commitCount) {
            this.commitCount = commitCount;
            return this;
        }

        public Builder setIsRestricted(boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        public Builder setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
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

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public CreatedCommitContributionTO build() {
            return new CreatedCommitContributionTO(commitCount, isRestricted, occurredAt, repository, resourcePath, url, user);
        }

    }
}

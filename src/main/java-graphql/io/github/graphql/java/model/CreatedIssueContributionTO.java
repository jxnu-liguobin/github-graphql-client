package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedIssueContributionTO implements java.io.Serializable, CreatedIssueOrRestrictedContributionTO, ContributionTO {

    private boolean isRestricted;
    @javax.validation.constraints.NotNull
    private IssueTO issue;
    @javax.validation.constraints.NotNull
    private String occurredAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;
    @javax.validation.constraints.NotNull
    private UserTO user;

    public CreatedIssueContributionTO() {
    }

    public CreatedIssueContributionTO(boolean isRestricted, IssueTO issue, String occurredAt, String resourcePath, String url, UserTO user) {
        this.isRestricted = isRestricted;
        this.issue = issue;
        this.occurredAt = occurredAt;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public boolean getIsRestricted() {
        return isRestricted;
    }

    public IssueTO getIssue() {
        return issue;
    }

    public String getOccurredAt() {
        return occurredAt;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreatedIssueContributionTO that = (CreatedIssueContributionTO) obj;
        return Objects.equals(isRestricted, that.isRestricted)
            && Objects.equals(issue, that.issue)
            && Objects.equals(occurredAt, that.occurredAt)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(url, that.url)
            && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRestricted, issue, occurredAt, resourcePath, url, user);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted));
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue));
        }
        if (occurredAt != null) {
            joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt));
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

    public static CreatedIssueContributionTO.Builder builder() {
        return new CreatedIssueContributionTO.Builder();
    }

    public static class Builder {

        private boolean isRestricted;
        private IssueTO issue;
        private String occurredAt;
        private String resourcePath;
        private String url;
        private UserTO user;

        public Builder() {
        }

        public Builder setIsRestricted(boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        public Builder setIssue(IssueTO issue) {
            this.issue = issue;
            return this;
        }

        public Builder setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
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


        public CreatedIssueContributionTO build() {
            return new CreatedIssueContributionTO(isRestricted, issue, occurredAt, resourcePath, url, user);
        }

    }
}

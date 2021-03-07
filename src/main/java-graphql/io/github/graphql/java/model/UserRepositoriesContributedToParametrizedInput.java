package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field repositoriesContributedTo in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserRepositoriesContributedToParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private java.util.List<RepositoryContributionTypeTO> contributionTypes;
    private Integer first;
    private Boolean includeUserRepositories;
    private Boolean isLocked;
    private Integer last;
    private RepositoryOrderTO orderBy;
    private RepositoryPrivacyTO privacy;

    public UserRepositoriesContributedToParametrizedInput() {
    }

    public UserRepositoriesContributedToParametrizedInput(String after, String before, java.util.List<RepositoryContributionTypeTO> contributionTypes, Integer first, Boolean includeUserRepositories, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, RepositoryPrivacyTO privacy) {
        this.after = after;
        this.before = before;
        this.contributionTypes = contributionTypes;
        this.first = first;
        this.includeUserRepositories = includeUserRepositories;
        this.isLocked = isLocked;
        this.last = last;
        this.orderBy = orderBy;
        this.privacy = privacy;
    }

    public UserRepositoriesContributedToParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput contributionTypes(java.util.List<RepositoryContributionTypeTO> contributionTypes) {
        this.contributionTypes = contributionTypes;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput includeUserRepositories(Boolean includeUserRepositories) {
        this.includeUserRepositories = includeUserRepositories;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput orderBy(RepositoryOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserRepositoriesContributedToParametrizedInput privacy(RepositoryPrivacyTO privacy) {
        this.privacy = privacy;
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
        final UserRepositoriesContributedToParametrizedInput that = (UserRepositoriesContributedToParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(contributionTypes, that.contributionTypes)
            && Objects.equals(first, that.first)
            && Objects.equals(includeUserRepositories, that.includeUserRepositories)
            && Objects.equals(isLocked, that.isLocked)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(privacy, that.privacy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, contributionTypes, first, includeUserRepositories, isLocked, last, orderBy, privacy);
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
        if (contributionTypes != null) {
            joiner.add("contributionTypes: " + GraphQLRequestSerializer.getEntry(contributionTypes));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (includeUserRepositories != null) {
            joiner.add("includeUserRepositories: " + GraphQLRequestSerializer.getEntry(includeUserRepositories));
        }
        if (isLocked != null) {
            joiner.add("isLocked: " + GraphQLRequestSerializer.getEntry(isLocked));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy));
        }
        return joiner.toString();
    }

}

package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field issueOrPullRequest in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryIssueOrPullRequestParametrizedInput implements GraphQLParametrizedInput {

    private int number;

    public RepositoryIssueOrPullRequestParametrizedInput() {
    }

    public RepositoryIssueOrPullRequestParametrizedInput(int number) {
        this.number = number;
    }

    public RepositoryIssueOrPullRequestParametrizedInput number(int number) {
        this.number = number;
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
        final RepositoryIssueOrPullRequestParametrizedInput that = (RepositoryIssueOrPullRequestParametrizedInput) obj;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        return joiner.toString();
    }

}

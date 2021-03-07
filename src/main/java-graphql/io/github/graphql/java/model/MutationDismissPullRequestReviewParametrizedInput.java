package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field dismissPullRequestReview in type Mutation
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MutationDismissPullRequestReviewParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private DismissPullRequestReviewInputTO input;

    public MutationDismissPullRequestReviewParametrizedInput() {
    }

    public MutationDismissPullRequestReviewParametrizedInput(DismissPullRequestReviewInputTO input) {
        this.input = input;
    }

    public MutationDismissPullRequestReviewParametrizedInput input(DismissPullRequestReviewInputTO input) {
        this.input = input;
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
        final MutationDismissPullRequestReviewParametrizedInput that = (MutationDismissPullRequestReviewParametrizedInput) obj;
        return Objects.equals(input, that.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (input != null) {
            joiner.add("input: " + GraphQLRequestSerializer.getEntry(input));
        }
        return joiner.toString();
    }

}

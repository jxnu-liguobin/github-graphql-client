package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field reviewDismissalAllowances in type BranchProtectionRule
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BranchProtectionRuleReviewDismissalAllowancesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput() {
    }

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput(String after, String before, Integer first, Integer last) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
    }

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public BranchProtectionRuleReviewDismissalAllowancesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
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
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        return joiner.toString();
    }

}

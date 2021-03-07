package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewDismissalAllowanceTO implements java.io.Serializable, NodeTO {

    private ReviewDismissalAllowanceActorTO actor;
    private BranchProtectionRuleTO branchProtectionRule;
    @javax.validation.constraints.NotNull
    private String id;

    public ReviewDismissalAllowanceTO() {
    }

    public ReviewDismissalAllowanceTO(ReviewDismissalAllowanceActorTO actor, BranchProtectionRuleTO branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public ReviewDismissalAllowanceActorTO getActor() {
        return actor;
    }

    public BranchProtectionRuleTO getBranchProtectionRule() {
        return branchProtectionRule;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static ReviewDismissalAllowanceTO.Builder builder() {
        return new ReviewDismissalAllowanceTO.Builder();
    }

    public static class Builder {

        private ReviewDismissalAllowanceActorTO actor;
        private BranchProtectionRuleTO branchProtectionRule;
        private String id;

        public Builder() {
        }

        public Builder setActor(ReviewDismissalAllowanceActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setBranchProtectionRule(BranchProtectionRuleTO branchProtectionRule) {
            this.branchProtectionRule = branchProtectionRule;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public ReviewDismissalAllowanceTO build() {
            return new ReviewDismissalAllowanceTO(actor, branchProtectionRule, id);
        }

    }
}

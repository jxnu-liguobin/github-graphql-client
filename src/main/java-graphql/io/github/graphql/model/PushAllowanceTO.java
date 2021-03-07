package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PushAllowanceTO implements java.io.Serializable, NodeTO {

    private PushAllowanceActorTO actor;
    private BranchProtectionRuleTO branchProtectionRule;
    @javax.validation.constraints.NotNull
    private String id;

    public PushAllowanceTO() {
    }

    public PushAllowanceTO(PushAllowanceActorTO actor, BranchProtectionRuleTO branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public PushAllowanceActorTO getActor() {
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

    public static PushAllowanceTO.Builder builder() {
        return new PushAllowanceTO.Builder();
    }

    public static class Builder {

        private PushAllowanceActorTO actor;
        private BranchProtectionRuleTO branchProtectionRule;
        private String id;

        public Builder() {
        }

        public Builder setActor(PushAllowanceActorTO actor) {
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


        public PushAllowanceTO build() {
            return new PushAllowanceTO(actor, branchProtectionRule, id);
        }

    }
}

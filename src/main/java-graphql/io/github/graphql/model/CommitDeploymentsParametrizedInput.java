package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field deployments in type Commit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitDeploymentsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    @javax.validation.constraints.NotNull
    private java.util.List<String> environments;
    private Integer first;
    private Integer last;
    private DeploymentOrderTO orderBy;

    public CommitDeploymentsParametrizedInput() {
    }

    public CommitDeploymentsParametrizedInput(String after, String before, java.util.List<String> environments, Integer first, Integer last, DeploymentOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.environments = environments;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public CommitDeploymentsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public CommitDeploymentsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public CommitDeploymentsParametrizedInput environments(java.util.List<String> environments) {
        this.environments = environments;
        return this;
    }

    public CommitDeploymentsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public CommitDeploymentsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public CommitDeploymentsParametrizedInput orderBy(DeploymentOrderTO orderBy) {
        this.orderBy = orderBy;
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
        if (environments != null) {
            joiner.add("environments: " + GraphQLRequestSerializer.getEntry(environments));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

}

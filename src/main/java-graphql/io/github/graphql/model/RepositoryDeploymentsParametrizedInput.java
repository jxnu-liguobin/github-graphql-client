package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field deployments in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryDeploymentsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    @javax.validation.constraints.NotNull
    private java.util.List<String> environments;
    private Integer first;
    private Integer last;
    private DeploymentOrderTO orderBy;

    public RepositoryDeploymentsParametrizedInput() {
    }

    public RepositoryDeploymentsParametrizedInput(String after, String before, java.util.List<String> environments, Integer first, Integer last, DeploymentOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.environments = environments;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public RepositoryDeploymentsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryDeploymentsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryDeploymentsParametrizedInput environments(java.util.List<String> environments) {
        this.environments = environments;
        return this;
    }

    public RepositoryDeploymentsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryDeploymentsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryDeploymentsParametrizedInput orderBy(DeploymentOrderTO orderBy) {
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

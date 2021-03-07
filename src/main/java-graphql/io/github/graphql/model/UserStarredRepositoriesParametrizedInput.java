package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field starredRepositories in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserStarredRepositoriesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private StarOrderTO orderBy;
    private Boolean ownedByViewer;

    public UserStarredRepositoriesParametrizedInput() {
    }

    public UserStarredRepositoriesParametrizedInput(String after, String before, Integer first, Integer last, StarOrderTO orderBy, Boolean ownedByViewer) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.ownedByViewer = ownedByViewer;
    }

    public UserStarredRepositoriesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserStarredRepositoriesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserStarredRepositoriesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserStarredRepositoriesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserStarredRepositoriesParametrizedInput orderBy(StarOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserStarredRepositoriesParametrizedInput ownedByViewer(Boolean ownedByViewer) {
        this.ownedByViewer = ownedByViewer;
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
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (ownedByViewer != null) {
            joiner.add("ownedByViewer: " + GraphQLRequestSerializer.getEntry(ownedByViewer));
        }
        return joiner.toString();
    }

}

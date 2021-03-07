package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field projectCards in type Issue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueProjectCardsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private java.util.List<ProjectCardArchivedStateTO> archivedStates = java.util.Arrays.asList(ProjectCardArchivedStateTO.ARCHIVED, ProjectCardArchivedStateTO.NOT_ARCHIVED);
    private String before;
    private Integer first;
    private Integer last;

    public IssueProjectCardsParametrizedInput() {
    }

    public IssueProjectCardsParametrizedInput(String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) {
        this.after = after;
        this.archivedStates = archivedStates;
        this.before = before;
        this.first = first;
        this.last = last;
    }

    public IssueProjectCardsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public IssueProjectCardsParametrizedInput archivedStates(java.util.List<ProjectCardArchivedStateTO> archivedStates) {
        this.archivedStates = archivedStates;
        return this;
    }

    public IssueProjectCardsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public IssueProjectCardsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public IssueProjectCardsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (archivedStates != null) {
            joiner.add("archivedStates: " + GraphQLRequestSerializer.getEntry(archivedStates));
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

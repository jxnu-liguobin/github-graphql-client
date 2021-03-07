package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field forks in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryForksParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<RepositoryAffiliationTO> affiliations = java.util.Arrays.asList(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR);
    private String after;
    private String before;
    private Integer first;
    private Boolean isLocked;
    private Integer last;
    private RepositoryOrderTO orderBy;
    private java.util.List<RepositoryAffiliationTO> ownerAffiliations = java.util.Arrays.asList(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR);
    private RepositoryPrivacyTO privacy;

    public RepositoryForksParametrizedInput() {
    }

    public RepositoryForksParametrizedInput(java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) {
        this.affiliations = affiliations;
        this.after = after;
        this.before = before;
        this.first = first;
        this.isLocked = isLocked;
        this.last = last;
        this.orderBy = orderBy;
        this.ownerAffiliations = ownerAffiliations;
        this.privacy = privacy;
    }

    public RepositoryForksParametrizedInput affiliations(java.util.List<RepositoryAffiliationTO> affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    public RepositoryForksParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryForksParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryForksParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryForksParametrizedInput isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public RepositoryForksParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryForksParametrizedInput orderBy(RepositoryOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public RepositoryForksParametrizedInput ownerAffiliations(java.util.List<RepositoryAffiliationTO> ownerAffiliations) {
        this.ownerAffiliations = ownerAffiliations;
        return this;
    }

    public RepositoryForksParametrizedInput privacy(RepositoryPrivacyTO privacy) {
        this.privacy = privacy;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (affiliations != null) {
            joiner.add("affiliations: " + GraphQLRequestSerializer.getEntry(affiliations));
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
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
        if (ownerAffiliations != null) {
            joiner.add("ownerAffiliations: " + GraphQLRequestSerializer.getEntry(ownerAffiliations));
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy));
        }
        return joiner.toString();
    }

}

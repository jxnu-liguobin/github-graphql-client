package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field securityAdvisories in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QuerySecurityAdvisoriesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private SecurityAdvisoryIdentifierFilterTO identifier;
    private Integer last;
    private SecurityAdvisoryOrderTO orderBy;
    private String publishedSince;
    private String updatedSince;

    public QuerySecurityAdvisoriesParametrizedInput() {
    }

    public QuerySecurityAdvisoriesParametrizedInput(String after, String before, Integer first, SecurityAdvisoryIdentifierFilterTO identifier, Integer last, SecurityAdvisoryOrderTO orderBy, String publishedSince, String updatedSince) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.identifier = identifier;
        this.last = last;
        this.orderBy = orderBy;
        this.publishedSince = publishedSince;
        this.updatedSince = updatedSince;
    }

    public QuerySecurityAdvisoriesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput identifier(SecurityAdvisoryIdentifierFilterTO identifier) {
        this.identifier = identifier;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput orderBy(SecurityAdvisoryOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput publishedSince(String publishedSince) {
        this.publishedSince = publishedSince;
        return this;
    }

    public QuerySecurityAdvisoriesParametrizedInput updatedSince(String updatedSince) {
        this.updatedSince = updatedSince;
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
        final QuerySecurityAdvisoriesParametrizedInput that = (QuerySecurityAdvisoriesParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(identifier, that.identifier)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(publishedSince, that.publishedSince)
            && Objects.equals(updatedSince, that.updatedSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, identifier, last, orderBy, publishedSince, updatedSince);
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
        if (identifier != null) {
            joiner.add("identifier: " + GraphQLRequestSerializer.getEntry(identifier));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (publishedSince != null) {
            joiner.add("publishedSince: " + GraphQLRequestSerializer.getEntry(publishedSince));
        }
        if (updatedSince != null) {
            joiner.add("updatedSince: " + GraphQLRequestSerializer.getEntry(updatedSince));
        }
        return joiner.toString();
    }

}

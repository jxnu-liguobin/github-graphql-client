package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field pinnableItems in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationPinnableItemsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private java.util.List<PinnableItemTypeTO> types;

    public OrganizationPinnableItemsParametrizedInput() {
    }

    public OrganizationPinnableItemsParametrizedInput(String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.types = types;
    }

    public OrganizationPinnableItemsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrganizationPinnableItemsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrganizationPinnableItemsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrganizationPinnableItemsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrganizationPinnableItemsParametrizedInput types(java.util.List<PinnableItemTypeTO> types) {
        this.types = types;
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
        final OrganizationPinnableItemsParametrizedInput that = (OrganizationPinnableItemsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(types, that.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, types);
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
        if (types != null) {
            joiner.add("types: " + GraphQLRequestSerializer.getEntry(types));
        }
        return joiner.toString();
    }

}

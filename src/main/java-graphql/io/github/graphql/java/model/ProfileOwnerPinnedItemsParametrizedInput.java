package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field pinnedItems in type ProfileOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProfileOwnerPinnedItemsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private java.util.List<PinnableItemTypeTO> types;

    public ProfileOwnerPinnedItemsParametrizedInput() {
    }

    public ProfileOwnerPinnedItemsParametrizedInput(String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.types = types;
    }

    public ProfileOwnerPinnedItemsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ProfileOwnerPinnedItemsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ProfileOwnerPinnedItemsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ProfileOwnerPinnedItemsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ProfileOwnerPinnedItemsParametrizedInput types(java.util.List<PinnableItemTypeTO> types) {
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
        final ProfileOwnerPinnedItemsParametrizedInput that = (ProfileOwnerPinnedItemsParametrizedInput) obj;
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

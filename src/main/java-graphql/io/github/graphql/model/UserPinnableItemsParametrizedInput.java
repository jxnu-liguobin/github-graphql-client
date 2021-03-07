package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field pinnableItems in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserPinnableItemsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private java.util.List<PinnableItemTypeTO> types;

    public UserPinnableItemsParametrizedInput() {
    }

    public UserPinnableItemsParametrizedInput(String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.types = types;
    }

    public UserPinnableItemsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserPinnableItemsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserPinnableItemsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserPinnableItemsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserPinnableItemsParametrizedInput types(java.util.List<PinnableItemTypeTO> types) {
        this.types = types;
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
        if (types != null) {
            joiner.add("types: " + GraphQLRequestSerializer.getEntry(types));
        }
        return joiner.toString();
    }

}

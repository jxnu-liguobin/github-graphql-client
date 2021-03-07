package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field anyPinnableItems in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserAnyPinnableItemsParametrizedInput implements GraphQLParametrizedInput {

    private PinnableItemTypeTO type;

    public UserAnyPinnableItemsParametrizedInput() {
    }

    public UserAnyPinnableItemsParametrizedInput(PinnableItemTypeTO type) {
        this.type = type;
    }

    public UserAnyPinnableItemsParametrizedInput type(PinnableItemTypeTO type) {
        this.type = type;
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
        final UserAnyPinnableItemsParametrizedInput that = (UserAnyPinnableItemsParametrizedInput) obj;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

}

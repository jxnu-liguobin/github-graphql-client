package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field anyPinnableItems in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

}

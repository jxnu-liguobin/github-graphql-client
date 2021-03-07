package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field anyPinnableItems in type ProfileOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProfileOwnerAnyPinnableItemsParametrizedInput implements GraphQLParametrizedInput {

    private PinnableItemTypeTO type;

    public ProfileOwnerAnyPinnableItemsParametrizedInput() {
    }

    public ProfileOwnerAnyPinnableItemsParametrizedInput(PinnableItemTypeTO type) {
        this.type = type;
    }

    public ProfileOwnerAnyPinnableItemsParametrizedInput type(PinnableItemTypeTO type) {
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

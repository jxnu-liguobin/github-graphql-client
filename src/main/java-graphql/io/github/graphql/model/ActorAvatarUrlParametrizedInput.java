package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field avatarUrl in type Actor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ActorAvatarUrlParametrizedInput implements GraphQLParametrizedInput {

    private Integer size;

    public ActorAvatarUrlParametrizedInput() {
    }

    public ActorAvatarUrlParametrizedInput(Integer size) {
        this.size = size;
    }

    public ActorAvatarUrlParametrizedInput size(Integer size) {
        this.size = size;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        return joiner.toString();
    }

}

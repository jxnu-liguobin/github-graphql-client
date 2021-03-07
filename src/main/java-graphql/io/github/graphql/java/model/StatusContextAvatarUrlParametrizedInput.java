package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field avatarUrl in type StatusContext
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class StatusContextAvatarUrlParametrizedInput implements GraphQLParametrizedInput {

    private Integer size = 40;

    public StatusContextAvatarUrlParametrizedInput() {
    }

    public StatusContextAvatarUrlParametrizedInput(Integer size) {
        this.size = size;
    }

    public StatusContextAvatarUrlParametrizedInput size(Integer size) {
        this.size = size;
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
        final StatusContextAvatarUrlParametrizedInput that = (StatusContextAvatarUrlParametrizedInput) obj;
        return Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
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

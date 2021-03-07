package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field avatarUrl in type Mannequin
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MannequinAvatarUrlParametrizedInput implements GraphQLParametrizedInput {

    private Integer size;

    public MannequinAvatarUrlParametrizedInput() {
    }

    public MannequinAvatarUrlParametrizedInput(Integer size) {
        this.size = size;
    }

    public MannequinAvatarUrlParametrizedInput size(Integer size) {
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
        final MannequinAvatarUrlParametrizedInput that = (MannequinAvatarUrlParametrizedInput) obj;
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

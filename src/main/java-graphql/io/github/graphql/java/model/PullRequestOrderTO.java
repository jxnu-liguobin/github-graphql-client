package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private PullRequestOrderFieldTO field;

    public PullRequestOrderTO() {
    }

    public PullRequestOrderTO(OrderDirectionTO direction, PullRequestOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public PullRequestOrderFieldTO getField() {
        return field;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PullRequestOrderTO that = (PullRequestOrderTO) obj;
        return Objects.equals(direction, that.direction)
            && Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, field);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (direction != null) {
            joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction));
        }
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field));
        }
        return joiner.toString();
    }

    public static PullRequestOrderTO.Builder builder() {
        return new PullRequestOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private PullRequestOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(PullRequestOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public PullRequestOrderTO build() {
            return new PullRequestOrderTO(direction, field);
        }

    }
}

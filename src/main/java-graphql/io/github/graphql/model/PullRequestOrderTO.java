package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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

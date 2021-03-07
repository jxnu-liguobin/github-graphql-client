package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RefOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private RefOrderFieldTO field;

    public RefOrderTO() {
    }

    public RefOrderTO(OrderDirectionTO direction, RefOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public RefOrderFieldTO getField() {
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

    public static RefOrderTO.Builder builder() {
        return new RefOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private RefOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(RefOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public RefOrderTO build() {
            return new RefOrderTO(direction, field);
        }

    }
}

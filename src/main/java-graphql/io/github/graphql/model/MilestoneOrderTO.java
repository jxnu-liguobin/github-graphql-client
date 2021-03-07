package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MilestoneOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private MilestoneOrderFieldTO field;

    public MilestoneOrderTO() {
    }

    public MilestoneOrderTO(OrderDirectionTO direction, MilestoneOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public MilestoneOrderFieldTO getField() {
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

    public static MilestoneOrderTO.Builder builder() {
        return new MilestoneOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private MilestoneOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(MilestoneOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public MilestoneOrderTO build() {
            return new MilestoneOrderTO(direction, field);
        }

    }
}

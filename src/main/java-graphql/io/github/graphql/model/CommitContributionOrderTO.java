package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitContributionOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private CommitContributionOrderFieldTO field;

    public CommitContributionOrderTO() {
    }

    public CommitContributionOrderTO(OrderDirectionTO direction, CommitContributionOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public CommitContributionOrderFieldTO getField() {
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

    public static CommitContributionOrderTO.Builder builder() {
        return new CommitContributionOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private CommitContributionOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(CommitContributionOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public CommitContributionOrderTO build() {
            return new CommitContributionOrderTO(direction, field);
        }

    }
}

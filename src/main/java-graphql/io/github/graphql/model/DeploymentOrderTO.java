package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeploymentOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private DeploymentOrderFieldTO field;

    public DeploymentOrderTO() {
    }

    public DeploymentOrderTO(OrderDirectionTO direction, DeploymentOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public DeploymentOrderFieldTO getField() {
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

    public static DeploymentOrderTO.Builder builder() {
        return new DeploymentOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private DeploymentOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(DeploymentOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public DeploymentOrderTO build() {
            return new DeploymentOrderTO(direction, field);
        }

    }
}

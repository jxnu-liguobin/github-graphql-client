package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private TeamOrderFieldTO field;

    public TeamOrderTO() {
    }

    public TeamOrderTO(OrderDirectionTO direction, TeamOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public TeamOrderFieldTO getField() {
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
        final TeamOrderTO that = (TeamOrderTO) obj;
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

    public static TeamOrderTO.Builder builder() {
        return new TeamOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private TeamOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(TeamOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public TeamOrderTO build() {
            return new TeamOrderTO(direction, field);
        }

    }
}

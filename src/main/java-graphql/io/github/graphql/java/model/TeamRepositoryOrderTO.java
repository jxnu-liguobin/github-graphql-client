package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamRepositoryOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    @javax.validation.constraints.NotNull
    private TeamRepositoryOrderFieldTO field;

    public TeamRepositoryOrderTO() {
    }

    public TeamRepositoryOrderTO(OrderDirectionTO direction, TeamRepositoryOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public TeamRepositoryOrderFieldTO getField() {
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
        final TeamRepositoryOrderTO that = (TeamRepositoryOrderTO) obj;
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

    public static TeamRepositoryOrderTO.Builder builder() {
        return new TeamRepositoryOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private TeamRepositoryOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(TeamRepositoryOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public TeamRepositoryOrderTO build() {
            return new TeamRepositoryOrderTO(direction, field);
        }

    }
}

package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorshipOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;

    public SponsorshipOrderTO() {
    }

    public SponsorshipOrderTO(OrderDirectionTO direction) {
        this.direction = direction;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SponsorshipOrderTO that = (SponsorshipOrderTO) obj;
        return Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (direction != null) {
            joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction));
        }
        return joiner.toString();
    }

    public static SponsorshipOrderTO.Builder builder() {
        return new SponsorshipOrderTO.Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }


        public SponsorshipOrderTO build() {
            return new SponsorshipOrderTO(direction);
        }

    }
}

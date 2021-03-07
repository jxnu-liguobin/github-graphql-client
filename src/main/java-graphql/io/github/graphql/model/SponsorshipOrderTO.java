package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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

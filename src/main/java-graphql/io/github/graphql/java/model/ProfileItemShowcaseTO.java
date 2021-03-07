package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProfileItemShowcaseTO implements java.io.Serializable {

    private boolean hasPinnedItems;

    public ProfileItemShowcaseTO() {
    }

    public ProfileItemShowcaseTO(boolean hasPinnedItems) {
        this.hasPinnedItems = hasPinnedItems;
    }

    public boolean getHasPinnedItems() {
        return hasPinnedItems;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProfileItemShowcaseTO that = (ProfileItemShowcaseTO) obj;
        return Objects.equals(hasPinnedItems, that.hasPinnedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPinnedItems);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("hasPinnedItems: " + GraphQLRequestSerializer.getEntry(hasPinnedItems));
        return joiner.toString();
    }

    public static ProfileItemShowcaseTO.Builder builder() {
        return new ProfileItemShowcaseTO.Builder();
    }

    public static class Builder {

        private boolean hasPinnedItems;

        public Builder() {
        }

        public Builder setHasPinnedItems(boolean hasPinnedItems) {
            this.hasPinnedItems = hasPinnedItems;
            return this;
        }


        public ProfileItemShowcaseTO build() {
            return new ProfileItemShowcaseTO(hasPinnedItems);
        }

    }
}

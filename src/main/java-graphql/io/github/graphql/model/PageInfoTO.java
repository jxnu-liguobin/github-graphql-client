package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PageInfoTO implements java.io.Serializable {

    private String endCursor;
    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private String startCursor;

    public PageInfoTO() {
    }

    public PageInfoTO(String endCursor, boolean hasNextPage, boolean hasPreviousPage, String startCursor) {
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }

    public boolean getHasNextPage() {
        return hasNextPage;
    }

    public boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    public String getStartCursor() {
        return startCursor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor));
        }
        joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage));
        joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage));
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor));
        }
        return joiner.toString();
    }

    public static PageInfoTO.Builder builder() {
        return new PageInfoTO.Builder();
    }

    public static class Builder {

        private String endCursor;
        private boolean hasNextPage;
        private boolean hasPreviousPage;
        private String startCursor;

        public Builder() {
        }

        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }

        public Builder setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        public Builder setHasPreviousPage(boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }


        public PageInfoTO build() {
            return new PageInfoTO(endCursor, hasNextPage, hasPreviousPage, startCursor);
        }

    }
}

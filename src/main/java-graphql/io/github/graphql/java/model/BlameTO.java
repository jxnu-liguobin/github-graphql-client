package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BlameTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<BlameRangeTO> ranges;

    public BlameTO() {
    }

    public BlameTO(java.util.List<BlameRangeTO> ranges) {
        this.ranges = ranges;
    }

    public java.util.List<BlameRangeTO> getRanges() {
        return ranges;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BlameTO that = (BlameTO) obj;
        return Objects.equals(ranges, that.ranges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ranges);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ranges != null) {
            joiner.add("ranges: " + GraphQLRequestSerializer.getEntry(ranges));
        }
        return joiner.toString();
    }

    public static BlameTO.Builder builder() {
        return new BlameTO.Builder();
    }

    public static class Builder {

        private java.util.List<BlameRangeTO> ranges;

        public Builder() {
        }

        public Builder setRanges(java.util.List<BlameRangeTO> ranges) {
            this.ranges = ranges;
            return this;
        }


        public BlameTO build() {
            return new BlameTO(ranges);
        }

    }
}

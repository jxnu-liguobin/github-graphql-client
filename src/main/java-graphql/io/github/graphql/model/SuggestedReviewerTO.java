package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SuggestedReviewerTO implements java.io.Serializable {

    private boolean isAuthor;
    private boolean isCommenter;
    @javax.validation.constraints.NotNull
    private UserTO reviewer;

    public SuggestedReviewerTO() {
    }

    public SuggestedReviewerTO(boolean isAuthor, boolean isCommenter, UserTO reviewer) {
        this.isAuthor = isAuthor;
        this.isCommenter = isCommenter;
        this.reviewer = reviewer;
    }

    public boolean getIsAuthor() {
        return isAuthor;
    }

    public boolean getIsCommenter() {
        return isCommenter;
    }

    public UserTO getReviewer() {
        return reviewer;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("isAuthor: " + GraphQLRequestSerializer.getEntry(isAuthor));
        joiner.add("isCommenter: " + GraphQLRequestSerializer.getEntry(isCommenter));
        if (reviewer != null) {
            joiner.add("reviewer: " + GraphQLRequestSerializer.getEntry(reviewer));
        }
        return joiner.toString();
    }

    public static SuggestedReviewerTO.Builder builder() {
        return new SuggestedReviewerTO.Builder();
    }

    public static class Builder {

        private boolean isAuthor;
        private boolean isCommenter;
        private UserTO reviewer;

        public Builder() {
        }

        public Builder setIsAuthor(boolean isAuthor) {
            this.isAuthor = isAuthor;
            return this;
        }

        public Builder setIsCommenter(boolean isCommenter) {
            this.isCommenter = isCommenter;
            return this;
        }

        public Builder setReviewer(UserTO reviewer) {
            this.reviewer = reviewer;
            return this;
        }


        public SuggestedReviewerTO build() {
            return new SuggestedReviewerTO(isAuthor, isCommenter, reviewer);
        }

    }
}

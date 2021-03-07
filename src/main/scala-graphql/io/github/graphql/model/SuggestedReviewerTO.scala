package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SuggestedReviewerTO(
    isAuthor: Boolean,
    isCommenter: Boolean,
    @javax.validation.constraints.NotNull
    reviewer: UserTO
) {

    override def toString(): String = {
        Seq(
            "isAuthor: " + GraphQLRequestSerializer.getEntry(isAuthor),
            "isCommenter: " + GraphQLRequestSerializer.getEntry(isCommenter),
            if (reviewer != null) "reviewer: " + GraphQLRequestSerializer.getEntry(reviewer) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SuggestedReviewerTO {

    def builder(): SuggestedReviewerTO.Builder = new Builder()

    class Builder {

        private var isAuthor: Boolean = _
        private var isCommenter: Boolean = _
        private var reviewer: UserTO = _

        def setIsAuthor(isAuthor: Boolean): Builder = {
            this.isAuthor = isAuthor
            this
        }

        def setIsCommenter(isCommenter: Boolean): Builder = {
            this.isCommenter = isCommenter
            this
        }

        def setReviewer(reviewer: UserTO): Builder = {
            this.reviewer = reviewer
            this
        }

        def build(): SuggestedReviewerTO = new SuggestedReviewerTO(isAuthor, isCommenter, reviewer)

    }
}

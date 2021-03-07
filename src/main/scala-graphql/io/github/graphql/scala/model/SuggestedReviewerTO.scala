package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SuggestedReviewerTO]
        Objects.equals(isAuthor, that.isAuthor) &&
        Objects.equals(isCommenter, that.isCommenter) &&
        Objects.equals(reviewer, that.reviewer)
    }

    override def hashCode(): Int = {
        Objects.hash(isAuthor, isCommenter, reviewer)
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

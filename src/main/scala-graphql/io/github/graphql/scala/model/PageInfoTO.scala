package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PageInfoTO(
    endCursor: String,
    hasNextPage: Boolean,
    hasPreviousPage: Boolean,
    startCursor: String
) {

    override def toString(): String = {
        Seq(
            if (endCursor != null) "endCursor: " + GraphQLRequestSerializer.getEntry(endCursor) else "",
            "hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage),
            "hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage),
            if (startCursor != null) "startCursor: " + GraphQLRequestSerializer.getEntry(startCursor) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PageInfoTO]
        Objects.equals(endCursor, that.endCursor) &&
        Objects.equals(hasNextPage, that.hasNextPage) &&
        Objects.equals(hasPreviousPage, that.hasPreviousPage) &&
        Objects.equals(startCursor, that.startCursor)
    }

    override def hashCode(): Int = {
        Objects.hash(endCursor, hasNextPage, hasPreviousPage, startCursor)
    }
}

object PageInfoTO {

    def builder(): PageInfoTO.Builder = new Builder()

    class Builder {

        private var endCursor: String = _
        private var hasNextPage: Boolean = _
        private var hasPreviousPage: Boolean = _
        private var startCursor: String = _

        def setEndCursor(endCursor: String): Builder = {
            this.endCursor = endCursor
            this
        }

        def setHasNextPage(hasNextPage: Boolean): Builder = {
            this.hasNextPage = hasNextPage
            this
        }

        def setHasPreviousPage(hasPreviousPage: Boolean): Builder = {
            this.hasPreviousPage = hasPreviousPage
            this
        }

        def setStartCursor(startCursor: String): Builder = {
            this.startCursor = startCursor
            this
        }

        def build(): PageInfoTO = new PageInfoTO(endCursor, hasNextPage, hasPreviousPage, startCursor)

    }
}

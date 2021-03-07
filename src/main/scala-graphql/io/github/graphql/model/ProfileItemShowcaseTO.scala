package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProfileItemShowcaseTO(
    hasPinnedItems: Boolean
) {

    override def toString(): String = {
        Seq(
            "hasPinnedItems: " + GraphQLRequestSerializer.getEntry(hasPinnedItems)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ProfileItemShowcaseTO {

    def builder(): ProfileItemShowcaseTO.Builder = new Builder()

    class Builder {

        private var hasPinnedItems: Boolean = _

        def setHasPinnedItems(hasPinnedItems: Boolean): Builder = {
            this.hasPinnedItems = hasPinnedItems
            this
        }

        def build(): ProfileItemShowcaseTO = new ProfileItemShowcaseTO(hasPinnedItems)

    }
}

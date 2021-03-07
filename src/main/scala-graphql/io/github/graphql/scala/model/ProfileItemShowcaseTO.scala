package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ProfileItemShowcaseTO(
    hasPinnedItems: Boolean
) {

    override def toString(): String = {
        Seq(
            "hasPinnedItems: " + GraphQLRequestSerializer.getEntry(hasPinnedItems)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ProfileItemShowcaseTO]
        Objects.equals(hasPinnedItems, that.hasPinnedItems)
    }

    override def hashCode(): Int = {
        Objects.hash(hasPinnedItems)
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

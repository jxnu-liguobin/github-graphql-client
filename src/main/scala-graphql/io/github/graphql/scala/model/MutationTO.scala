package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MutationTO(
) {

    override def toString(): String = {
        "{}"
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MutationTO]
        true
    }

    override def hashCode(): Int = {
        0
    }
}

object MutationTO {

    def builder(): MutationTO.Builder = new Builder()

    class Builder {


        def build(): MutationTO = new MutationTO()

    }
}

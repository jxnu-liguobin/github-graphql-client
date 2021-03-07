package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BlameTO(
    @javax.validation.constraints.NotNull
    ranges: Seq[BlameRangeTO]
) {

    override def toString(): String = {
        Seq(
            if (ranges != null) "ranges: " + GraphQLRequestSerializer.getEntry(ranges.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BlameTO]
        Objects.equals(ranges, that.ranges)
    }

    override def hashCode(): Int = {
        Objects.hash(ranges)
    }
}

object BlameTO {

    def builder(): BlameTO.Builder = new Builder()

    class Builder {

        private var ranges: Seq[BlameRangeTO] = _

        def setRanges(ranges: Seq[BlameRangeTO]): Builder = {
            this.ranges = ranges
            this
        }

        def build(): BlameTO = new BlameTO(ranges)

    }
}

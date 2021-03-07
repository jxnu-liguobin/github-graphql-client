package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
